package whilec;

import java.util.LinkedList;
import java.util.Queue;

import org.antlr.runtime.tree.Tree;

public class Generateur3A {

    private final static String reg = "_R";
    private final static String lab = "_L";
    private final static String tmp = "_T";

    private int regcnt = 0;
    private int labcnt = 0;
    private int tmpcnt = 0;

    private Tree ast;

    private Queue<String> to_assign = new LinkedList<>();

    public Generateur3A(Tree ast) {
        this.ast = ast;
    }

    public void generate() {
        System.out.println(generateRec(ast));
    }

    private String generateRec(Tree ast) {
        String txt = ast.getText();
        String res = "";
        int chcnt = ast.getChildCount();
        int curlab = labcnt;
        switch (txt) {
            case "PROGRAM":
                for (int i = 0; i < chcnt; i++) {
                    res += generateRec(ast.getChild(i));
                }
                break;
            case "FUNCTION":
                res += "func begin " + generateRec(ast.getChild(0)) + "\n"; // name
                res += generateRec(ast.getChild(1)); // definition
                res += "\tReturn\n";
                res += "func end\n";
                break;
            case "FUNC_NAME":
                res += generateRec(ast.getChild(0));
                break;
            case "DEFINITION":
                res += generateRec(ast.getChild(0)); // input
                res += generateRec(ast.getChild(1)); // commands
                res += generateRec(ast.getChild(2)); // output
                break;
            case "INPUT":
                for (int i = 0; i < chcnt; i++) {
                    res += "\tinput " + generateRec(ast.getChild(i)) + "\n";
                }
                break;
            case "COMMANDS":
                for (int i = 0; i < chcnt; i++) {
                    res += generateRec(ast.getChild(i));
                }
                break;
            case "OUTPUT":
                for (int i = 0; i < chcnt; i++) {
                    res += "\treturn " + generateRec(ast.getChild(i)) + "\n";
                }
                break;
            case "ASSIGN":
                res += generateRec(ast.getChild(1)); // expressions
                res += generateRec(ast.getChild(0)); // variables
                break;
            case "VARIABLES":
                if (to_assign.size() == chcnt) {
                    for (int i = 0; i < chcnt; i++) {
                        res += "\t" + generateRec(ast.getChild(i)) + " = " + to_assign.poll() + "\n";
                    }
                }
                else {
                    for (int i = 0; i < chcnt; i++) {
                        res += "\t" + generateRec(ast.getChild(i)) + " = " + reg(-1) + "[" + i + "]\n";
                    }
                }
                break;
            case "EXPRESSIONS":
                for (int i = 0; i < chcnt; i++) {
                    res += generateRec(ast.getChild(i));
                    to_assign.add(reg(-1));
                }
                break;
            case "EQU":
                res += generateRec(ast.getChild(0)); // left
                to_assign.add(reg(-1));
                res += generateRec(ast.getChild(1)); // right
                res += "\t" + reg() + " = " + to_assign.poll() + " equ " + reg(-1) + "\n";
                regcnt++;
                break;
            case "IF":
                res += generateRec(ast.getChild(0)); // cond
                if (chcnt == 2) {
                    res += "\tifz " + reg(-1) + " goto " + lab("end_if") + "\n";
                    labcnt++;
                    res += generateRec(ast.getChild(1)); // then
                    res += lab("end_if", curlab - labcnt) + ":\n";
                }
                else {
                    res += "\tifz " + reg(-1) + " goto " + lab("false") + "\n";
                    labcnt++;
                    res += generateRec(ast.getChild(1)); // then
                    res += "\tgoto " + lab("end_if", curlab - labcnt + 1) + "\n";
                    labcnt++;
                    res += lab("false", curlab - labcnt) + ":\n";
                    res += generateRec(ast.getChild(2)); // else
                    res += lab("end_if", curlab - labcnt + 1) + ":\n";
                    labcnt++;
                }
                break;
            case "THEN":
                for (int i = 0; i < chcnt; i++) {
                    res += generateRec(ast.getChild(i));
                }
                break;
            case "ELSE":
                for (int i = 0; i < chcnt; i++) {
                    res += generateRec(ast.getChild(i));
                }
                break;
            case "WHILE":
                res += lab("while") + ":\n";
                labcnt++;
                res += generateRec(ast.getChild(0)); // cond
                res += "\tifz " + reg(-1) + " goto " + lab("end_while") + "\n";
                labcnt++;
                res += generateRec(ast.getChild(1)); // body
                res += "\tgoto " + lab("while", curlab - labcnt) + "\n";
                res += lab("end_while", curlab - labcnt + 1) + ":\n";
                break;
            case "FOR":
                res += generateRec(ast.getChild(0)); // iter
                res += lab("for") + ":\n";
                labcnt++;
                res += "\tifz " + tmp("Iter", -1) + " goto " + lab("end_for") + "\n";
                labcnt++;
                res += "\t" + tmp("Iter", -1) + " = tl " + tmp("Iter", -1) + "\n";
                res += generateRec(ast.getChild(1)); // body
                res += "\tgoto " + lab("for", curlab - labcnt) + "\n";
                res += lab("end_for", curlab - labcnt + 1) + ":\n";
                break;
            case "FOREACH":
                res += generateRec(ast.getChild(1)); // iter
                res += lab("foreach") + ":\n";
                labcnt++;
                res += "\tifz " + tmp("Iter", -1) + " goto " + lab("end_foreach") + "\n";
                labcnt++;
                res += "\t" + generateRec(ast.getChild(0)) + " = hd " + tmp("Iter", -1) + "\n";
                res += "\t" + tmp("Iter", -1) + " = tl " + tmp("Iter", -1) + "\n";
                res += generateRec(ast.getChild(2)); // body
                res += "\tgoto " + lab("foreach", curlab - labcnt) + "\n";
                res += lab("end_foreach", curlab - labcnt + 1) + ":\n";
                break;
            case "COND":
                res += generateRec(ast.getChild(0)); // expression
                break;
            case "ITER":
                res += generateRec(ast.getChild(0)); // expression
                res += "\t" + tmp("Iter") + " = " + reg(-1) + "\n";
                tmpcnt++;
                break;
            case "BODY":
                for (int i = 0; i < chcnt; i++) {
                    res += generateRec(ast.getChild(i));
                }
                break;
            case "NOP":
                res += "\tnop\n";
                break;
            case "CALL":
                for (int i = 1; i < chcnt; i++) {
                    res += generateRec(ast.getChild(i));
                    res += "\tparam " + reg(-1) + "\n";
                }
                res += "\t" + reg() + " = call " + generateRec(ast.getChild(0)) + " " + (chcnt-1) + "\n";
                regcnt++;
                break;
            case "CONS":
                switch (chcnt) {
                    case 0:
                        res += "\t" + reg() + " = nil\n";
                        regcnt++;
                        break;
                    case 1:
                        res += generateRec(ast.getChild(0));
                        res += "\t" + reg() + " = cons " + reg(-1) + "\n";
                        regcnt++;
                        break;
                    case 2:
                        res += generateRec(ast.getChild(0));
                        res += generateRec(ast.getChild(1));
                        res += "\t" + reg() + " = " + reg(-2) + " cons " + reg(-1) + "\n";
                        regcnt++;
                        break;
                    default:
                        res += generateRec(ast.getChild(chcnt - 1));
                        for (int i = chcnt - 2; i >= 0; i--) {
                            res += generateRec(ast.getChild(i));
                            res += "\t" + reg() + " = " + reg(-2) + " cons " + reg(-1) + "\n";
                            regcnt++;
                        }
                        break;
                }
                break;
            case "LIST":
                res += "\t" + reg() + " = nil\n";
                regcnt++;
                for (int i = chcnt - 1; i >= 0; i--) {
                    res += generateRec(ast.getChild(i));
                    res += "\t" + reg() + " = " + reg(-2) + " cons " + reg(-1) + "\n";
                    regcnt++;
                }
                break;
            case "HD":
                res += generateRec(ast.getChild(0));
                res += "\t" + reg() + " = hd " + reg(-1) + "\n";
                regcnt++;
                break;
            case "TL":
                res += generateRec(ast.getChild(0));
                res += "\t" + reg() + " = tl " + reg(-1) + "\n";
                regcnt++;
                break;
            case "NIL":
                res += "\t" + reg() + " = nil\n";
                regcnt++;
                break;
            case "VAR":
                res += "\t" + reg() + " = " + generateRec(ast.getChild(0)) + "\n";
                regcnt++;
                break;
            case "SYM":
                res += "\t" + reg() + " = " + generateRec(ast.getChild(0)) + "\n";
                regcnt++;
                break;
            default:
                res = txt;
                break;
        }
        return res;
    }

    private String reg(int off) {
        return reg + (regcnt + off);
    }

    private String reg() {
        return reg + regcnt;
    }

    private String lab(String name, int off) {
        return name + lab + (labcnt + off);
    }

    private String lab(String name) {
        return name + lab + labcnt;
    }

    private String tmp(String name, int off) {
        return name + tmp + (tmpcnt + off);
    }

    private String tmp(String name) {
        return name + tmp + tmpcnt;
    }

}
