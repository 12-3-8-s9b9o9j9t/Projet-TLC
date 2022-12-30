package whilestd;

public abstract class BinTree implements Cloneable {

    abstract protected int toInt();

    abstract protected boolean toBool();

    abstract public String toString();

    abstract protected BinTree hd();

    abstract protected BinTree tl();

    @Override
    abstract public BinTree clone();

    abstract public boolean equals(Object other);

    abstract protected void prettyPrint();
}
