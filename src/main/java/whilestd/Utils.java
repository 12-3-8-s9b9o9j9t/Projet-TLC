package whilestd;

import whilestd.output.inputLexer;
import whilestd.output.inputParser;
import org.antlr.runtime.*;

public class Utils {
    
    private Utils() {
    }

    public static BinTree nil() {
        return new Node();
    }

    public static int Int(BinTree t) {
        return t.toInt();
    }

    public static boolean Bool(BinTree t) {
        return t.toBool();
    }

    public static String Str(BinTree t) {
        return t.toString();
    }

    public static BinTree hd(BinTree t) {
        return t.hd();
    }

    public static BinTree tl(BinTree t) {
        return t.tl();
    }

    public static BinTree cons(BinTree left, BinTree right) {
        return new Node(left, right);
    }

    public static BinTree cons(BinTree tree) {
        return tree.clone();
    }

    public static BinTree symb(String symbol) {
        return new Leaf(symbol);
    }

    public static void pp(BinTree t) {
        t.prettyPrint();
    }

    public static BinTree[] parse(String[] args) {
        BinTree[] trees = new BinTree[args.length];
        for (int i = 0; i < args.length; i++) {
            ANTLRStringStream in = new ANTLRStringStream(args[i]);
            inputLexer lexer = new inputLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            inputParser parser = new inputParser(tokens);
            try {
                trees[i] = parser.parse();
            }
            catch (RecognitionException e) {
                System.out.println("Input " + i + " is not valid");
                return null;
            }
        }
        return trees;
    }

    public static BinTree toTree(int val) {
        BinTree t = nil();
        for (int j = 0; j < val; j++) {
            t = cons(nil(), t);
        }
        return t;
    }

    public static void main(String[] args) {
        BinTree[] trees = parse(args);
        if (trees == null) {
            return;
        }
        for (BinTree t : trees) {
            pp(t);
        }
    }

}
