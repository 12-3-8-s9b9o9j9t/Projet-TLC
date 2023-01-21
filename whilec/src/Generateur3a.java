import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.antlr.runtime.tree.Tree;

public class Generateur3a {

    private class Assign {
        public String val;
        public int size;

        public Assign(String val, int size) {
            this.val = val;
            this.size = size;
        }
    }

    private int regcnt = 0;
    private int labcnt = 0;

    private Tree ast;

    private Queue<Assign> to_assign = new LinkedList<>();
    private Queue<String> tmp_memory = new LinkedList<>();
    private Deque<String[]> code = new LinkedList<>();

    private SpaghettiStack table;

    private String curfun = "";

    public Generateur3a(Tree ast, SpaghettiStack table) {
        this.ast = ast;
        this.table = table;
    }

    @SuppressWarnings("unchecked")
    public List<String[]> generate() {
        generateRec(ast);
        return (List<String[]>)code;
    }

    private void generateRec(Tree ast) {
        String txt = ast.getText();
        int chcnt = ast.getChildCount();
        int curlab = labcnt;
        switch (txt) {
            case "PROGRAM":
            case "COMMANDS":
            case "THEN":
            case "ELSE":
            case "BODY":
                for (int i = 0; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
                }
                break;
            case "FUNCTION":
                code.add(new String[] {"func", "begin", ""});
                generateRec(ast.getChild(0)); // function name
                generateRec(ast.getChild(1)); // definition
                code.add(new String[] {"func", "end"});
                break;
            case "FUNC_NAME":
                generateRec(ast.getChild(0));
                curfun = ast.getChild(0).getText();
                break;
            case "DEFINITION":
                generateRec(ast.getChild(0)); // input
                generateRec(ast.getChild(1)); // commands
                generateRec(ast.getChild(2)); // output
                break;
            case "INPUT":
                if (curfun.equals("main")) {
                    for (int i = 0; i < chcnt; i++) {
                        code.add(new String[] {"parse", "", String.valueOf(i)});
                        generateRec(ast.getChild(i));
                    }
                }
                break;
            case "OUTPUT":
                if (curfun.equals("main")) {
                    for (int i = chcnt - 1; i >= 0; i--) {
                        code.add(new String[] {
                            "print", table.isDeclared(ast.getChild(i).getText(), curfun) 
                                ? ast.getChild(i).getText() 
                                : "nil"});
                    }
                }
                else {
                    code.add(new String[] {"store", reg(), ""});
                    regcnt++;
                    generateRec(ast.getChild(chcnt - 1));
                    if (!table.isDeclared(code.getLast()[2], curfun)) {
                        code.getLast()[2] = "nil";
                    }
                    for (int i = chcnt - 2; i >= 0; i--) {
                        code.add(new String[] {"store", reg(), ""});
                        regcnt++;
                        generateRec(ast.getChild(i));
                        if (!table.isDeclared(code.getLast()[2], curfun)) {
                            code.getLast()[2] = "nil";
                        }
                        code.add(new String[] {"cons", reg(), reg(-1), reg(-2)});
                        regcnt++;
                    }
                    code.add(new String[] {"return", reg(-1)});
                }
                break;
            case "ASSIGN":
                generateRec(ast.getChild(1)); // expressions
                generateRec(ast.getChild(0)); // variables
                break;
            case "VARIABLES":
                {
                    int i = 0;
                    while (i < chcnt) {
                        Assign a = to_assign.poll();
                        if (a.size == 1) {
                            code.add(new String[] {"store", "", a.val});
                            generateRec(ast.getChild(i));
                            i++;
                        }
                        else {
                            code.add(new String[] {"store", reg(), a.val});
                            regcnt++;
                            for (int j = 0; j < a.size - 1; j++) {
                                code.add(new String[] {"hd", "", reg(-1)});
                                generateRec(ast.getChild(i));
                                i++;
                                code.add(new String[] {"tl", reg(), reg(-1)});
                                regcnt++;
                            }
                            code.add(new String[] {"store", "", reg(-1)});
                            generateRec(ast.getChild(i));
                            i++;
                        }
                    }
                }
                break;
            case "EXPRESSIONS":
                for (int i = 0; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
                    to_assign.add(new Assign(reg(-1), nbValIn(ast.getChild(i))));
                }
                break;
            case "EQU":
                generateRec(ast.getChild(0)); // left
                tmp_memory.add(reg(-1));
                generateRec(ast.getChild(1)); // right
                code.add(new String[] {"equ", reg(), tmp_memory.poll(), reg(-1)});
                regcnt++;
                break;
            case "IF":
                generateRec(ast.getChild(0)); // cond
                if (chcnt == 2) {
                    code.add(new String[] {"ifz", reg(-1), "end_if" + curlab});
                    labcnt++;
                    generateRec(ast.getChild(1)); // then
                    code.add(new String[] {"label", "end_if" + curlab});
                } else {
                    code.add(new String[] {"ifz", reg(-1), "false" + curlab});
                    labcnt++;
                    generateRec(ast.getChild(1)); // then
                    code.add(new String[] {"goto", "end_if" + curlab});
                    code.add(new String[] {"label", "false" + curlab});
                    generateRec(ast.getChild(2)); // else
                    code.add(new String[] {"label", "end_if" + curlab});
                }
                break;
            case "WHILE":
                code.add(new String[] {"label", "loop" + curlab});
                labcnt++;
                generateRec(ast.getChild(0)); // cond
                code.add(new String[] {"ifz", reg(-1), "end_loop" + curlab});
                generateRec(ast.getChild(1)); // body
                code.add(new String[] {"goto", "loop" + curlab});
                code.add(new String[] {"label", "end_loop" + curlab});
                break;
            case "FOR":
                generateRec(ast.getChild(0)); // iter
                {
                    String iter = reg(-1);
                    code.add(new String[] {"label", "loop" + curlab});
                    labcnt++;
                    code.add(new String[] {"ifz", iter, "end_loop" + curlab});
                    code.add(new String[] {"tl", iter, iter});
                    generateRec(ast.getChild(1)); // body
                    code.add(new String[] {"goto", "loop" + curlab});
                    code.add(new String[] {"label", "end_loop" + curlab});
                }
                break;
            case "FOREACH":
                generateRec(ast.getChild(1)); // iter
                {
                    String iter = reg(-1);
                    code.add(new String[] {"label", "loop" + curlab});
                    labcnt++;
                    code.add(new String[] {"ifz", iter, "end_loop" + curlab});
                    code.add(new String[] {"hd", "", iter});
                    generateRec(ast.getChild(0));
                    code.add(new String[] {"tl", iter, iter});
                    generateRec(ast.getChild(2)); // body
                    code.add(new String[] {"goto", "loop" + curlab});
                    code.add(new String[] {"label", "end_loop" + curlab});
                }
                break;
            case "COND":
            case "ITER":
                generateRec(ast.getChild(0)); // expression
                break;
            case "NOP":
                code.add(new String[] {"nop"});
                break;
            case "CALL":
                for (int i = 1; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
                    code.add(new String[] {"param", reg(-1)});
                }
                code.add(new String[] {"call", reg(), "", String.valueOf(chcnt - 1)});
                generateRec(ast.getChild(0));
                regcnt++;
                break;
            case "CONS":
                switch (chcnt) {
                    case 0:
                        code.add(new String[] {"store", reg(), "nil"});
                        regcnt++;
                        break;
                    case 1:
                        generateRec(ast.getChild(0));
                        code.add(new String[] {"store", reg(), reg(-1)});
                        regcnt++;
                        break;
                    default:
                        generateRec(ast.getChild(chcnt - 1));
                        tmp_memory.add(reg(-1));
                        for (int i = chcnt - 2; i >= 1; i--) {
                            generateRec(ast.getChild(i));
                            code.add(new String[] {"cons", reg(), reg(-1), tmp_memory.poll()});
                            tmp_memory.add(reg(-1));
                            regcnt++;
                        }
                        generateRec(ast.getChild(0));
                        code.add(new String[] {"cons", reg(), reg(-1), tmp_memory.poll()});
                        regcnt++;
                        break;
                }
                break;
            case "LIST":
                switch (chcnt) {
                    case 0:
                        code.add(new String[] {"store", reg(), "nil"});
                        regcnt++;
                        break;
                    default:
                        tmp_memory.add("nil");
                        for (int i = chcnt - 2; i >= 1; i--) {
                            generateRec(ast.getChild(i));
                            code.add(new String[] {"cons", reg(), reg(-1), tmp_memory.poll()});
                            tmp_memory.add(reg(-1));
                            regcnt++;
                        }
                        generateRec(ast.getChild(0));
                        code.add(new String[] {"cons", reg(), reg(-1), tmp_memory.poll()});
                        regcnt++;
                        break;
                }
                break;
            case "HD":
                generateRec(ast.getChild(0));
                code.add(new String[] {"hd", reg(), reg(-1)});
                regcnt++;
                break;
            case "TL":
                generateRec(ast.getChild(0));
                code.add(new String[] {"tl", reg(), reg(-1)});
                regcnt++;
                break;
            case "NIL":
                code.add(new String[] {"store", reg(), "nil"});
                regcnt++;
                break;
            case "VAR":
            case "SYM":
                code.add(new String[] {"store", reg(), ""});
                generateRec(ast.getChild(0));
                regcnt++;
                break;
            default:
                String[] last = code.getLast();
                for (int i = 0; i < last.length; i++) {
                    if (last[i].equals("")) {
                        last[i] = ast.getText();
                        break;
                    }
                }
                break;
        }
    }

    private int nbValIn(Tree expr) {
        switch (expr.getText()) {
            case "CALL":
                return table.getOutputs(expr.getChild(0).getText()).size();
            default:
                return 1;
        }
    }

    private String reg(int off) {
        return "_R" + (regcnt + off);
    }

    private String reg() {
        return reg(0);
    }

}
