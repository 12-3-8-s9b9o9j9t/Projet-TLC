import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;

public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRStringStream in = new ANTLRStringStream(
            "function true :\n"+
            "read\n"+
            "%\n"+
            " Res, Res2 := (cons nil nil), nil\n"+
            "%\n"+
            "write Res, Res2"
        );
        whileLexer lexer = new whileLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        whileParser parser = new whileParser(tokens);
        whileParser.program_return pReturn = parser.program();
        
        Tree ast = (Tree) pReturn.getTree();
        Generateur3A g = new Generateur3A(ast);
        g.generate();
    }
}