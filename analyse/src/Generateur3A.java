import org.antlr.runtime.tree.Tree;

public class Generateur3A {

    private int regcnt = 0;
    private Tree ast;

    public Generateur3A(Tree ast) {
        this.ast = ast;
    }

    public void generate() {
        System.out.println(generateRec(ast));
    }

    private String generateRec(Tree ast) {
        String txt = ast.getText();
        String res = "";
        switch (txt) {
            case "FUNCTION":
                res += "func begin " + generateRec(ast.getChild(0)) + "\n"; // name
                res += generateRec(ast.getChild(1)); // definition
                res += "return\n";
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
                for (int i = 0; i < ast.getChildCount(); i++) {
                    res += "read " + generateRec(ast.getChild(i)) + "\n";
                }
                break;
            case "OUTPUT":
                for (int i = 0; i < ast.getChildCount(); i++) {
                    res += "write " + generateRec(ast.getChild(i)) + "\n";
                }
                break;
            case "COMMANDS":
                for (int i = 0; i < ast.getChildCount(); i++) {
                    res += generateRec(ast.getChild(i));
                }
                break;
            case "ASSIGN":
                res += generateRec(ast.getChild(1));
                res += generateRec(ast.getChild(0)) + " = " + reg(-1) + "\n";
                regcnt++;
                break;
            case "CONS":
                int chcnt = ast.getChildCount();
                switch (chcnt) {
                    case 0:
                        res += reg() + " = nil\n";
                        regcnt++;
                        break;
                    case 1:
                        res += generateRec(ast.getChild(0));
                        res += reg() + " = cons " + reg(-1) + "\n";
                        regcnt++;
                        break;
                    case 2:
                        res += generateRec(ast.getChild(0));
                        res += generateRec(ast.getChild(1));
                        res += reg() + " = cons " + reg(-1) + " " + reg(-2) + "\n";
                        regcnt++;
                        break;
                    default:
                        res += generateRec(ast.getChild(chcnt - 1));
                        for (int i = chcnt - 2; i >= 0; i--) {
                            res += generateRec(ast.getChild(i));
                            res += reg() + " = cons " + reg(-1) + " " + reg(-2) + "\n";
                            regcnt++;
                        }
                        break;
                }
                break;
            case "NIL":
                res += reg() + " = nil\n";
                regcnt++;
                break;
            default:
                res = txt;
                break;
        }
        return res;
    }

    private String reg(int off) {
        return "r" + (regcnt + off);
    }

    private String reg() {
        return "r" + regcnt;
    }

}
