import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;

import output.whileLexer;
import output.whileParser;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Error: No file path provided");
            return;
        }

        // Read the file into a string
        String content = "";
        System.out.println("Reading file " + args[0]);
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content += line + "\n";
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: Unable to read file");
            return;
        }

        ANTLRStringStream in = new ANTLRStringStream(content);
        whileLexer lexer = new whileLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        whileParser parser = new whileParser(tokens);
        whileParser.program_return pReturn = parser.program();
        
        Tree ast = (Tree) pReturn.getTree();

        Visitor v = new Visitor(ast);
        v.analyse();

        Generateur3a g = new Generateur3a(ast);
        
        try {
            g.generate(args[0] + ".3a");
        }
        catch (IOException e) {
            System.out.println("Error: Unable to write file containing 3-address code");
            return;
        }

        Code3aToCpp c = new Code3aToCpp();
        try {
            c.generate(args[0] + ".3a");
        }
        catch (IOException e) {
            System.out.println("Error: Unable to write file containing C++ code");
            return;
        }
    }
}