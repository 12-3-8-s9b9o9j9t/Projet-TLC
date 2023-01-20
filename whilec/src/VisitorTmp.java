import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.tree.Tree;

public class VisitorTmp {

    Tree ast;
    SpaghettiStackTmp root = new SpaghettiStackTmp();

    public VisitorTmp(Tree ast) {
        this.ast = ast;
    }

    public Map<String, SpaghettiStackTmp.Tuple<Set<String>, Set<String>, List<String>>> analyse() throws Exception {
        for (int i = 0; i < ast.getChildCount(); i++) {
            analyseFunc(ast.getChild(i));
        }
        if (root.addStack("main")) {
            throw new Exception("Error: main function was not declared");
        }
        return this.root.getSymbols();
    }

    private void analyseFunc(Tree function) throws Exception {
        String funcName = function.getChild(0).getChild(0).getText();
        if (!root.addStack(funcName)) {
            throw new Exception("Error line " + function.getChild(0).getChild(0).getLine() + ": function " + funcName + " already declared");
        }

        Tree input = function.getChild(1).getChild(0);

        for (int i = 0; i < input.getChildCount(); i++) {
            if (!root.addInput(input.getChild(i).getText(), funcName)) {
                throw new Exception("Error line " + input.getChild(i).getLine() + ": input " + input.getChild(i).getText() + " already declared");
            }
        }

        Tree output = function.getChild(1).getChild(2);

        for (int i = 0; i < output.getChildCount(); i++) {
            root.addOutput(output.getChild(i).getText(), funcName);
        }

        Tree commands = function.getChild(1).getChild(1);

        for (int i = 0; i < commands.getChildCount(); i++) {
            analyseCommand(commands.getChild(i), funcName);
        }
        
    }

    private void analyseCommand(Tree command, String funcName) throws Exception{
        switch (command.getText()) {
            case "ASSIGN":
                assignIsCorrect(command, funcName);
                break;
            case "IF":
                ifIsCorrect(command, funcName);
                break;
            case "WHILE":
                whileIsCorrect(command, funcName);
                break;
            case "FOR":
                forIsCorrect(command, funcName);
                break;
            case "FOREACH":
                foreachIsCorrect(command, funcName);
                break;
        }
    }

    private void assignIsCorrect(Tree command, String funcName) throws Exception {
        int totalAssign = 0;
        for (int i = 0; i < command.getChild(1).getChildCount(); i++) {
            totalAssign += analyseExpression(command.getChild(1).getChild(i), funcName);
        }

        if (totalAssign == command.getChild(0).getChildCount()) {
            for (int i = 0; i < command.getChild(0).getChildCount(); i++) {
                root.addLocal(command.getChild(0).getChild(i).getText(), funcName);
            }
        }
        
        else {
            throw new Exception("Error line " + command.getLine() + ": number of variables (" + command.getChild(0).getChildCount() + ") does not match number of assigned values (" + totalAssign + ")");
        }
    }

    private void ifIsCorrect(Tree command, String funcName) throws Exception {
        // analyse la condition
        analyseExpression(command.getChild(0).getChild(0), funcName);

        // analyse les commandes du then
        for (int i = 0; i < command.getChild(1).getChildCount(); i++) {
            analyseCommand(command.getChild(1).getChild(i), funcName);
        }

        if (command.getChildCount() == 3) {
            // analyse les commandes du else
            for (int i = 0; i < command.getChild(2).getChildCount(); i++) {
                analyseCommand(command.getChild(2).getChild(i), funcName);
            }
        }
    }

    private void whileIsCorrect(Tree command, String funcName) throws Exception {
        // analyse la condition
        analyseExpression(command.getChild(0).getChild(0), funcName);

        // analyse les commandes
        for (int i = 0; i < command.getChild(1).getChildCount(); i++) {
            analyseCommand(command.getChild(1).getChild(i), funcName);
        }
    }

    private void forIsCorrect(Tree command, String funcName) throws Exception {
        // analyse l'expression pour l'itération
        analyseExpression(command.getChild(0).getChild(0), funcName);

        // analyse les commandes
        for (int i = 0; i < command.getChild(1).getChildCount(); i++) {
            analyseCommand(command.getChild(1).getChild(i), funcName);
        }
    }

    private void foreachIsCorrect(Tree command, String funcName) throws Exception {
        if (!root.addLocal(command.getChild(0).getText(), funcName)) {
            throw new Exception("Error line " + command.getChild(0).getChild(0).getLine() + ": variable " + command.getChild(0).getChild(0).getText() + " already declared");
        }
        
        // analyse l'expression pour l'itération
        analyseExpression(command.getChild(1).getChild(0), funcName);

        // analyse les commandes
        for (int i = 0; i < command.getChild(2).getChildCount(); i++) {
            analyseCommand(command.getChild(2).getChild(i), funcName);
        }
    }

    private int analyseExpression(Tree expr, String funcName) throws Exception {
        switch (expr.getText()) {
            case "EQU":
                if (analyseExpression(expr.getChild(0), funcName) != 1 &&  analyseExpression(expr.getChild(1), funcName) != 1) {
                    throw new Exception("Error line " + expr.getLine() + ": cannot compare more than one value, tried to compare " + analyseExpression(expr.getChild(0), funcName) + " and " + analyseExpression(expr.getChild(1), funcName) + " values");
                }
                return 1;
            case "VAR":
                root.addLocal(expr.getChild(0).getText(), funcName);
                return 1;
            case "CONS":
            case "LIST":
                for (int i = 0; i < expr.getChildCount(); i++) {
                    analyseExpression(expr.getChild(i), funcName);
                }
                return 1;
            case "HD":
            case "TL":
                analyseExpression(expr.getChild(0), funcName);
                return 1;
            case "CALL":
                return callIsCorrect(expr, funcName);
            default:
                return 1;
        }
    }

    private int callIsCorrect(Tree call, String funcName) throws Exception {
        String name = call.getChild(0).getText();
        
        if (name.equals("main")) {
            throw new Exception("Error line " + call.getLine() + ": cannot call main function");
        }

        Tree function = findFunction(name);
        if (function == null) {
            throw new Exception("Error line " + call.getLine() + ": function " + name + " not found");
        }

        int nbInput = function.getChild(1).getChild(0).getChildCount();
        int nbGivenInput = 0;
        for (int i = 1; i < call.getChildCount(); i++) {
            nbGivenInput += analyseExpression(call.getChild(i), funcName);
        }

        if (nbInput != nbGivenInput) {
            throw new Exception("Error line " + call.getLine() + ": function " + name + " takes " + nbInput + " arguments, " + nbGivenInput + " given");
        }
        
        return function.getChild(1).getChild(2).getChildCount();
    }
    

    private Tree findFunction(String name) {
        for (int i = 0; i < this.ast.getChildCount(); i++) {
            if (this.ast.getChild(i).getChild(0).getChild(0).getText().equals(name)) {
                return this.ast.getChild(i);
            }
        }
        return null;
    }
}
