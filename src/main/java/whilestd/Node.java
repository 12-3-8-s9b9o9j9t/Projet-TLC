package whilestd;

import static whilestd.Utils.Nil;

public class Node extends BinTree {

    private BinTree left = null;
    private BinTree right = null;

    public Node() {}

    public Node(BinTree left, BinTree right) {
        this.left = left.clone();
        this.right = right.clone();
    }

    @Override
    protected int toInt() {
        return this.right != null ? 1 + this.right.toInt() : 0;
    }

    @Override
    protected boolean toBool() {
        return this.right != null;
    }

    @Override
    public String toString() {
        return this.left.toString() + this.right.toString();
    }

    @Override
    protected BinTree hd() {
        return this.left != null ? this.left.clone() : Nil();
    }

    @Override
    protected BinTree tl() {
        return this.right != null ? this.right.clone() : Nil();
    }


    @Override
    public BinTree clone() {
        return new Node(left.clone(), right.clone());
    }


    @Override
    public boolean equals(Object other) {
        if (other instanceof Node) {
            Node otherNode = (Node) other;
            return this.left.equals(otherNode.left) && this.right.equals(otherNode.right);
        }
        return false;
    }

    @Override
    protected void prettyPrint() {
        if ( this.left == null && this.right == null ) {
            System.out.print("nil");
        } else if (this.left.toString().equals("int")) {
            System.out.print(this.right.toInt());
        } else if (this.left.toString().equals("bool")) {
            System.out.print(this.right.toBool());
        } else if (this.left.toString().equals("string")) {
            System.out.print(this.right.toString());
        } else {
            System.out.print("(cons ");
            this.left.prettyPrint();
            System.out.print(" ");
            this.right.prettyPrint();
            System.out.print(")");
        }
    }
}
