import java.util.LinkedList;
import java.util.Queue;

import org.antlr.runtime.tree.Tree;

public class Generateur3a {

    private final static String reg = "_R";

    private int regcnt = 0;
    private int labcnt = 0;
    private int tmpcnt = 0;

    private Tree ast;

    private Queue<String> to_assign = new LinkedList<>();

    private LinkedList<String[]> code = new LinkedList<>();

    public Generateur3a(Tree ast) {
        this.ast = ast;
    }

    public LinkedList<String[]> generate() {
        generateRec(ast);
        return code;
    }

    private void generateRec(Tree ast) {
        String txt = ast.getText();
        int chcnt = ast.getChildCount();
        int curlab = labcnt;
        switch (txt) {
            case "PROGRAM":
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
                break;
            case "DEFINITION":
                generateRec(ast.getChild(0)); // input
                generateRec(ast.getChild(1)); // commands
                generateRec(ast.getChild(2)); // output
                break;
            case "INPUT":
                for (int i = 0; i < chcnt; i++) {
                    code.add(new String[] {"input", ""});
                    generateRec(ast.getChild(i));
                }
                break;
            case "COMMANDS":
                for (int i = 0; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
                }
                break;
            case "OUTPUT":
                for (int i = 0; i < chcnt; i++) {
                    code.add(new String[] {"return", ""});
                    generateRec(ast.getChild(i));
                }
                break;
            case "ASSIGN":
                generateRec(ast.getChild(1)); // expressions
                generateRec(ast.getChild(0)); // variables
                break;
            case "VARIABLES": //TODO: handle function calls
                if (to_assign.size() == chcnt) {
                    for (int i = 0; i < chcnt; i++) {
                        code.add(new String[] {"store", "", to_assign.poll()});
                        generateRec(ast.getChild(i));
                    }
                } else {
                    for (int i = 0; i < chcnt; i++) {
                        generateRec(ast.getChild(i));
                        String[] last = code.getLast();
                        last[last.length - 1] = reg(-1) + "[" + i + "]";
                        to_assign.poll();
                    }
                }
                break;
            case "EXPRESSIONS":
                for (int i = 0; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
                    to_assign.add(reg(-1));
                }
                break;
            case "EQU":
                generateRec(ast.getChild(0)); // left
                to_assign.add(reg(-1));
                generateRec(ast.getChild(1)); // right
                code.add(new String[] {"equ", reg(), to_assign.poll(), reg(-1)});
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
            case "THEN":
                for (int i = 0; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
                }
                break;
            case "ELSE":
                for (int i = 0; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
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
                code.add(new String[] {"label", "loop" + curlab});
                labcnt++;
                code.add(new String[] {"ifz", tmp("_i", -1), "end_loop" + curlab});
                code.add(new String[] {"tl", reg(), tmp("_i", -1)});
                regcnt++;
                code.add(new String[] {"store", tmp("_i", -1), reg(-1)});
                generateRec(ast.getChild(1)); // body
                code.add(new String[] {"goto", "loop" + curlab});
                code.add(new String[] {"label", "end_loop" + curlab});
                break;
            case "FOREACH":
                generateRec(ast.getChild(1)); // iter
                code.add(new String[] {"label", "loop" + curlab});
                labcnt++;
                code.add(new String[] {"ifz", tmp("_i", -1), "end_loop" + curlab});
                code.add(new String[] {"hd", reg(), tmp("_i", -1)});
                regcnt++;
                code.add(new String[] {"store", "", reg(-1)});
                generateRec(ast.getChild(0));
                code.add(new String[] {"tl", reg(), tmp("_i", -1)});
                regcnt++;
                code.add(new String[] {"store", tmp("_i", -1), reg(-1)});
                generateRec(ast.getChild(2)); // body
                code.add(new String[] {"goto", "loop" + curlab});
                code.add(new String[] {"label", "end_loop" + curlab});
                break;
            case "COND":
                generateRec(ast.getChild(0)); // expression
                break;
            case "ITER":
                generateRec(ast.getChild(0)); // expression
                code.add(new String[] {"store", tmp("_i"), reg(-1)});
                tmpcnt++;
                break;
            case "BODY":
                for (int i = 0; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
                }
                break;
            case "NOP":
                code.add(new String[] {"nop"});
                break;
            case "CALL":
                for (int i = 1; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
                    code.add(new String[] {"param", reg(-1)});
                }
                code.add(new String[] {"call", reg(), "", ""+(chcnt - 1)});
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
                        to_assign.add(reg(-1));
                        for (int i = chcnt - 2; i >= 1; i--) {
                            generateRec(ast.getChild(i));
                            code.add(new String[] {"cons", reg(), reg(-1), to_assign.poll()});
                            to_assign.add(reg(-1));
                            regcnt++;
                        }
                        generateRec(ast.getChild(0));
                        code.add(new String[] {"cons", reg(), reg(-1), to_assign.poll()});
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
                        to_assign.add("nil");
                        for (int i = chcnt - 2; i >= 1; i--) {
                            generateRec(ast.getChild(i));
                            code.add(new String[] {"cons", reg(), reg(-1), to_assign.poll()});
                            to_assign.add(reg(-1));
                            regcnt++;
                        }
                        generateRec(ast.getChild(0));
                        code.add(new String[] {"cons", reg(), reg(-1), to_assign.poll()});
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
                code.add(new String[] {"store", reg(), ""});
                generateRec(ast.getChild(0));
                regcnt++;
                break;
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

    private String reg(int off) {
        return reg + (regcnt + off);
    }

    private String reg() {
        return reg + regcnt;
    }

    private String tmp(String name, int off) {
        return name + (tmpcnt + off);
    }

    private String tmp(String name) {
        return name + tmpcnt;
    }

}
