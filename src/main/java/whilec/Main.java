package whilec;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;

import whilec.output.whileLexer;
import whilec.output.whileParser;

public class Main {
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
        System.out.println(ast.toStringTree());
        Generateur3A g = new Generateur3A(ast);
        g.generate();
    }
}