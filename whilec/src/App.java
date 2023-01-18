import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;

import output.whileLexer;
import output.whileParser;

public class App {
    public static void main(String[] args) {
        /*if (args.length == 0) {
            System.out.println("Error: No file path provided");
            return;
        }*/
        args = new String[] {"../code.txt"};

        // Read the file into a string
        String content = "";
        System.out.println("Reading file " + args[0]);
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content += line + "\n";
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to read file " + e.getMessage());
            System.exit(1);
        }

        ANTLRStringStream in = new ANTLRStringStream(content);
        whileLexer lexer = new whileLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        whileParser parser = new whileParser(tokens);
        
        try {
            whileParser.program_return pReturn = parser.program();
            Tree ast = (Tree) pReturn.getTree();

            Visitor v = new Visitor(ast);
            v.analyse();

            Generateur3a g = new Generateur3a(ast);
            LinkedList<String[]> code3a = g.generate();
            
            for (String[] line : code3a) {
                for (String s : line) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }

            Code3aToCppOld c = new Code3aToCppOld();
            try {
                c.generate(args[0]);
            }
            catch (IOException e) {
                System.out.println("Error: Unable to write output file " + e.getMessage());
                System.exit(1);
            }
        } catch (RecognitionException e) {
            System.out.println("Syntax error: " + e.getMessage());
            System.exit(1);
        }
    }
}