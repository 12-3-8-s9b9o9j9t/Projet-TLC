package whilestd;

import static whilestd.Utils.nil;

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
        return this.isNil() ? 0 : 1 + this.right.toInt();
    }

    @Override
    protected boolean toBool() {
        return !this.isNil();
    }

    @Override
    public String toString() {
        return this.isNil() ? "nil" : this.left.toString() + this.right.toString();
    }

    @Override
    protected BinTree hd() {
        return this.isNil() ? nil() : this.left.clone();
    }

    @Override
    protected BinTree tl() {
        return this.isNil() ? nil() : this.right.clone();
    }


    @Override
    public BinTree clone() {
        return this.isNil() ? nil() : new Node(this.left, this.right);
    }


    @Override
    public boolean equals(Object other) {
        if (other instanceof Node) {
            Node otherNode = (Node) other;
            if (this.isNil()) {
                return otherNode.isNil();
            }
            else {
                return !otherNode.isNil() && this.left.equals(otherNode.left) && this.right.equals(otherNode.right);
            }
        }
        return false;
    }

    @Override
    protected void prettyPrint() {
        if (this.isNil()) {
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

    private boolean isNil() {
        return this.left == null && this.right == null;
    }
}
