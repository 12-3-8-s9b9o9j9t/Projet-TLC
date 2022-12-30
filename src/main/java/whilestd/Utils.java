package whilestd;

public class Utils {
    
    private Utils() {
    }

    public static BinTree Nil() {
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
            try {
                int val = Integer.parseInt(args[i]);
                trees[i] = toTree(val);
            } catch (NumberFormatException e) {
                
            }
        }
        return trees;
    }

    private static BinTree toTree(int val) {
        BinTree t = Nil();
        for (int j = 0; j < val; j++) {
            t = cons(Nil(), t);
        }
        return t;
    }

}
