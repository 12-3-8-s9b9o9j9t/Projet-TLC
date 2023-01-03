import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.LinkedList;
import java.util.Queue;

import org.antlr.runtime.tree.Tree;

public class Generateur3a {

    private final static String reg = "_R";
    private final static String lab = "_L";

    private int regcnt = 0;
    private int labcnt = 0;
    private int tmpcnt = 0;

    private Tree ast;
    private BufferedWriter writer = null;

    private Queue<String> to_assign = new LinkedList<>();

    public Generateur3a(Tree ast) {
        this.ast = ast;
    }

    public void generate(String outputName) throws IOException {
        writer = new BufferedWriter(new FileWriter(outputName));
        generateRec(ast);
        writer.close();
    }

    private void generateRec(Tree ast) throws IOException {
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
                writer.append("func begin ");
                generateRec(ast.getChild(0)); // function name
                writer.newLine();
                generateRec(ast.getChild(1)); // definition
                writer.append("func end");
                writer.newLine();
                writer.newLine();
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
                for (int i = chcnt - 1; i >= 0; i--) {
                    writer.append("  input ");
                    generateRec(ast.getChild(i));
                    writer.newLine();
                }
                break;
            case "COMMANDS":
                for (int i = 0; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
                }
                break;
            case "OUTPUT":
                for (int i = 0; i < chcnt; i++) {
                    writer.append("  return ");
                    generateRec(ast.getChild(i));
                    writer.newLine();
                }
                break;
            case "ASSIGN":
                generateRec(ast.getChild(1)); // expressions
                generateRec(ast.getChild(0)); // variables
                break;
            case "VARIABLES":
                if (to_assign.size() == chcnt) {
                    for (int i = 0; i < chcnt; i++) {
                        writer.append("  ");
                        generateRec(ast.getChild(i));
                        writer.append(" = " + to_assign.poll());
                        writer.newLine();
                    }
                } else {
                    for (int i = 0; i < chcnt; i++) {
                        writer.append("  ");
                        generateRec(ast.getChild(i));
                        writer.append(" = " + reg(-1) + "[" + i + "]");
                        to_assign.poll();
                        writer.newLine();
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
                writer.append("  " + reg() + " = " + to_assign.poll() + " equ " + reg(-1));
                writer.newLine();
                regcnt++;
                break;
            case "IF":
                generateRec(ast.getChild(0)); // cond
                if (chcnt == 2) {
                    writer.append("  ifz " + reg(-1) + " goto " + lab("end_if"));
                    writer.newLine();
                    labcnt++;
                    generateRec(ast.getChild(1)); // then
                    writer.append(lab("end_if", curlab - labcnt) + ":");
                    writer.newLine();
                } else {
                    writer.append("  ifz " + reg(-1) + " goto " + lab("false"));
                    writer.newLine();
                    labcnt++;
                    generateRec(ast.getChild(1)); // then
                    writer.append("  goto " + lab("end_if", curlab - labcnt + 1));
                    writer.newLine();
                    labcnt++;
                    writer.append(lab("false", curlab - labcnt) + ":");
                    writer.newLine();
                    generateRec(ast.getChild(2)); // else
                    writer.append(lab("end_if", curlab - labcnt + 1) + ":");
                    writer.newLine();
                    labcnt++;
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
                writer.append(lab("while") + ":");
                writer.newLine();
                labcnt++;
                generateRec(ast.getChild(0)); // cond
                writer.append("  ifz " + reg(-1) + " goto " + lab("end_while"));
                writer.newLine();
                labcnt++;
                generateRec(ast.getChild(1)); // body
                writer.append("  goto " + lab("while", curlab - labcnt));
                writer.newLine();
                writer.append(lab("end_while", curlab - labcnt + 1) + ":");
                writer.newLine();
                break;
            case "FOR":
                generateRec(ast.getChild(0)); // iter
                writer.append(lab("for") + ":");
                writer.newLine();
                labcnt++;
                writer.append("  ifz " + tmp("_i", -1) + " goto " + lab("end_for"));
                writer.newLine();
                labcnt++;
                writer.append("  " + reg() + " = tl " + tmp("_i", -1));
                regcnt++;
                writer.newLine();
                writer.append("  " + tmp("_i", -1) + " = " + reg(-1));
                writer.newLine();
                generateRec(ast.getChild(1)); // body
                writer.append("  goto " + lab("for", curlab - labcnt));
                writer.newLine();
                writer.append(lab("end_for", curlab - labcnt + 1) + ":");
                writer.newLine();
                break;
            case "FOREACH":
                generateRec(ast.getChild(1)); // iter
                writer.append(lab("foreach") + ":");
                writer.newLine();
                labcnt++;
                writer.append("  ifz " + tmp("_i", -1) + " goto " + lab("end_foreach"));
                writer.newLine();
                labcnt++;
                writer.append("  " + reg() + " = hd " + tmp("_i", -1));
                regcnt++;
                writer.newLine();
                writer.append("  ");
                generateRec(ast.getChild(0));
                writer.append(" = " + reg(-1));
                writer.newLine();
                writer.append("  " + reg() + " = tl " + tmp("_i", -1));
                regcnt++;
                writer.newLine();
                writer.append("  " + tmp("_i", -1) + " = " + reg(-1));
                writer.newLine();
                generateRec(ast.getChild(2)); // body
                writer.append("  goto " + lab("foreach", curlab - labcnt));
                writer.newLine();
                writer.append(lab("end_foreach", curlab - labcnt + 1) + ":");
                writer.newLine();
                break;
            case "COND":
                generateRec(ast.getChild(0)); // expression
                break;
            case "ITER":
                generateRec(ast.getChild(0)); // expression
                writer.append("  " + tmp("_i") + " = " + reg(-1));
                writer.newLine();
                tmpcnt++;
                break;
            case "BODY":
                for (int i = 0; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
                }
                break;
            case "NOP":
                writer.append("  nop");
                writer.newLine();
                break;
            case "CALL":
                for (int i = 1; i < chcnt; i++) {
                    generateRec(ast.getChild(i));
                    writer.append("  param " + reg(-1));
                    writer.newLine();
                }
                writer.append("  " + reg() + " = call ");
                generateRec(ast.getChild(0));
                writer.append(" " + (chcnt - 1));
                writer.newLine();
                regcnt++;
                break;
            case "CONS":
                switch (chcnt) {
                    case 0:
                        writer.append("  " + reg() + " = nil");
                        writer.newLine();
                        regcnt++;
                        break;
                    case 1:
                        generateRec(ast.getChild(0));
                        writer.append("  " + reg() + " = cons " + reg(-1));
                        writer.newLine();
                        regcnt++;
                        break;
                    case 2:
                        generateRec(ast.getChild(0));
                        to_assign.add(reg(-1));
                        generateRec(ast.getChild(1));
                        writer.append("  " + reg() + " = " + to_assign.poll() + " cons " + reg(-1));
                        writer.newLine();
                        regcnt++;
                        break;
                    default:
                        generateRec(ast.getChild(chcnt - 1));
                        to_assign.add(reg(-1));
                        for (int i = chcnt - 2; i >= 0; i--) {
                            generateRec(ast.getChild(i));
                            writer.append("  " + reg() + " = " + to_assign.poll() + " cons " + reg(-1));
                            to_assign.add(reg(-1));
                            writer.newLine();
                            regcnt++;
                        }
                        to_assign.poll();
                        break;
                }
                break;
            case "LIST":
                writer.append("  " + reg() + " = nil");
                writer.newLine();
                regcnt++;
                for (int i = chcnt - 1; i >= 0; i--) {
                    generateRec(ast.getChild(i));
                    writer.append("  " + reg() + " = " + reg(-2) + " cons " + reg(-1));
                    writer.newLine();
                    regcnt++;
                }
                break;
            case "HD":
                generateRec(ast.getChild(0));
                writer.append("  " + reg() + " = hd " + reg(-1));
                writer.newLine();
                regcnt++;
                break;
            case "TL":
                generateRec(ast.getChild(0));
                writer.append("  " + reg() + " = tl " + reg(-1));
                writer.newLine();
                regcnt++;
                break;
            case "NIL":
                writer.append("  " + reg() + " = nil");
                writer.newLine();
                regcnt++;
                break;
            case "VAR":
                writer.append("  " + reg() + " = ");
                generateRec(ast.getChild(0));
                writer.newLine();
                regcnt++;
                break;
            case "SYM":
                writer.append("  " + reg() + " = ");
                generateRec(ast.getChild(0));
                writer.newLine();
                regcnt++;
                break;
            default:
                writer.append(txt);
                break;
        }
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
        return name + (tmpcnt + off);
    }

    private String tmp(String name) {
        return name + tmpcnt;
    }

}
