import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;

public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRStringStream in = new ANTLRStringStream("function sub :\n"
                + "read Op1, Op2\n"
                + "%\n"
                + "for Op2 do\n"
                + " Result := (tl Result)\n"
                + "od\n"
                + "%\n"
                + "write Result\n"
                + "function mul :\n"
                + "read Op1, Op2\n"
                + "%\n"
                + "for Op1 do\n"
                + " Result, Op1 := (add Result Op2)\n"
                + "od\n"
                + ";\n"
                + "for Op1 do\n"
                + " Vide := Op1\n"
                + "od\n"
                + "%\n"
                + "write Result, Vide");
        whileLexer lexer = new whileLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        whileParser parser = new whileParser(tokens);
        System.out.println(parser.program());

        Tree ast = (Tree) parser.program().getTree();
        Visitor v = new Visitor(ast);
        v.analyse();
    }
}