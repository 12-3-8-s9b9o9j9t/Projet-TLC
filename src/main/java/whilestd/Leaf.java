package whilestd;

import static whilestd.Utils.nil;

public class Leaf extends BinTree {

    private String symbol;

    public Leaf(String symbol) {
        this.symbol = symbol;
    }

    @Override
    protected int toInt() {
        return 0;
    }

    @Override
    protected boolean toBool() {
        return false;
    }

    @Override
    public String toString() {
        return this.symbol;
    }

    @Override
    protected BinTree hd() {
        return nil();
    }

    @Override
    protected BinTree tl() {
        return nil();
    }

    @Override
    public BinTree clone() {
        return new Leaf(this.symbol);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Leaf) {
            Leaf otherLeaf = (Leaf) other;
            return this.symbol.equals(otherLeaf.symbol);
        }
        return false;
    }

    @Override
    protected void prettyPrint() {
        System.out.print(this.symbol);
    }
    
}
