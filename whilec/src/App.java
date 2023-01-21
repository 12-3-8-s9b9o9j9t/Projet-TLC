import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;

import output.whileLexer;
import output.whileParser;

public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No file path provided");
            return;
        }

        // Read the file into a string
        String content = "";
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
            Table table = v.analyse();
            /*
            for (String fun : table.getFunctions()) {
                System.out.println(fun +":");
                Set<String> inputs = table.getInputs(fun);
                System.out.println("  Inputs:");
                for (String input : inputs) {
                    System.out.println("\t" + input);
                }
                Set<String> locals = table.getLocals(fun);
                System.out.println("  Locals:");
                for (String local : locals) {
                    System.out.println("\t" + local);
                }
                List<String> outputs = table.getOutputs(fun);
                System.out.println("  Outputs:");
                for (String output : outputs) {
                    System.out.println("\t" + output);
                }
                System.out.println("--------------------");
            }*/

            Generateur3a g = new Generateur3a(ast, table);
            List<String[]> code3a = g.generate();
            /*
            for (String[] line : code3a) {
                for (String s : line) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }*/

            Code3aToCpp c = new Code3aToCpp(code3a);
            c.generate(args[0], table);

        } catch (RecognitionException e) {
            System.out.println("Syntax error");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Error: Unable to write output file " + e.getMessage());
            System.exit(1);
        } catch (CompilationException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}