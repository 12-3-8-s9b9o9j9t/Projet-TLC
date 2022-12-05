import org.antlr.runtime.tree.Tree;

public class Visitor {

    Tree ast;

    public Visitor(Tree ast) {
        this.ast = ast;
    }

    public void analyse() {
        System.out.println("prout");
        System.out.println(ast.getChildCount());
    }    
}