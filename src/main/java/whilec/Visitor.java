package whilec;

import org.antlr.runtime.tree.Tree;

public class Visitor {

    Tree ast;

    public Visitor(Tree ast) {
        this.ast = ast;
    }

    public void analyse() {
        System.out.println("slt");
        System.out.println(ast.getChildCount());
    }    
}