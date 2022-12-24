import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;

public class Main {
    public static void main(String[] args) throws Exception {

        Path path = Path.of("resource/code.txt");
        String content = Files.readString(path);

        ANTLRStringStream in = new ANTLRStringStream(content);
        whileLexer lexer = new whileLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        whileParser parser = new whileParser(tokens);
        whileParser.program_return pReturn = parser.program();
        
        Tree ast = (Tree) pReturn.getTree();
        System.out.println(ast.toStringTree());
        Generateur3A g = new Generateur3A(ast);
        g.generate();
    }
}