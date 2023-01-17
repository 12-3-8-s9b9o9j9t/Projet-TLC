import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class Code3aToCpp {

    private BufferedReader reader = null;
    private BufferedWriter writer = null;

    private String line = null;
    private String[] tokens = null;

    private List<String> headers = new LinkedList<String>();
    private List<StringBuilder> functions = new LinkedList<StringBuilder>();
    private StringBuilder main = null;

    private static final String regexSym = "(?:[a-z])(?:[A-Z]|[a-z]|[0-9])*(?:[!]|[?])?";
    private static final String regexVar = "(?:[A-Z])(?:[A-Z]|[a-z]|[0-9])*(?:[!]|[?])?";
    private static final String regexReg = "(?:_R)(?:[0-9])+";
    private static final String regexTmp = "(?:_i)(?:[0-9])+";

    public void generate(String inputName) throws IOException {
        reader = new BufferedReader(new FileReader(inputName));
        writer = new BufferedWriter(new FileWriter(inputName.replace(".3a", ".cpp")));

        headers.add("<whilestd/BinTree.h>");
        headers.add("<whilestd/Node.h>");
        headers.add("<whilestd/Leaf.h>");
        headers.add("<whilestd/Parser.h>");

        while ((line = reader.readLine()) != null) {
            tokens = line.split("\\s+");
            if (tokens.length == 3) {
                String name = tokens[2];
                if (name.equals("main")) {
                    main = generateFunction(name);
                }
                else {
                    functions.add(generateFunction(name));
                }
            }
        }

        generateHeaders();
        writer.newLine();

        writer.append("using namespace whilestd;");
        writer.newLine();
        writer.newLine();

        if (functions.size() > 0) {
            writer.append("namespace {");
            writer.newLine();
            writer.newLine();
            writer.append("std::stack<BinTreePtr> _stack;");
            writer.newLine();
            writer.newLine();

            for (StringBuilder function : functions) {
                writer.append(function);
                writer.newLine();
            }

            writer.append("} // namespace");
            writer.newLine();
            writer.newLine();
        }

        writer.append(main);

        reader.close();
        writer.close();
    }

    private void generateHeaders() throws IOException {
        for (String header : headers) {
            writer.append("#include " + header);
            writer.newLine();
        }
        writer.newLine();
    }

    private StringBuilder generateFunction(String name) throws IOException {
        String space = "    ";
        int nbspace = name.equals("main") ? 2 : 1;
        if (!name.equals("main") && functions.size() == 0) {
            headers.add("<stack>");
        }

        StringBuilder rettype = new StringBuilder("BinTreePtr");
        List<String> inputs = new LinkedList<String>();
        List<String> locals = new LinkedList<String>();
        List<String> tmps = new LinkedList<String>();
        Deque<String> returns = new LinkedList<String>();

        StringBuilder body = new StringBuilder();
        
        while ((line = reader.readLine()) != null) {
            tokens = line.split("\\s+");
            if (tokens[0].isEmpty()) {
                if (tokens[1].equals("input")) {
                    inputs.add(format(tokens[2]));
                }
                else if (tokens[1].equals("param")) {
                    body.append(space.repeat(nbspace) + "_stack.push(std::move(" + tokens[2] + "));\n");
                }
                else if (tokens[1].equals("return")) {
                    returns.add(format(tokens[2]));
                }
                else if (tokens[1].equals("goto")) {
                    // nothing
                }
                else if (tokens[1].equals("ifz")) {
                    if (tokens[4].contains("for")) {
                        body.append("\n" + space.repeat(nbspace) + "while (static_cast<bool>(*" + tokens[2] + ")) {\n");
                    }
                    else {
                        body.append("\n" + space.repeat(nbspace) + "if (static_cast<bool>(*" + tokens[2] + ")) {\n");
                    }
                    nbspace++;
                }
                else if (tokens[1].matches(regexVar)) {
                    String var = format(tokens[1]);
                    if (!locals.contains(var) && !inputs.contains(var)) {
                        locals.add(var);
                    }
                    body.append(space.repeat(nbspace) + var + " = std::move(" + tokens[3] +");\n");
                }
                else if (tokens[1].matches(regexTmp)) {
                    if (tmps.contains(tokens[1])){
                        body.append(space.repeat(nbspace) + tokens[1] + " = std::move(" + tokens[3] + ");\n");
                    }
                    else {
                        body.append(space.repeat(nbspace) + "auto " + tokens[1] + " = std::move(" + tokens[3] + ");\n");
                        tmps.add(tokens[1]);
                    }
                }
                else if (tokens[1].matches(regexReg)) {
                    switch (tokens.length) {
                        case 4:
                            if (tokens[3].equals("nil")) {
                                body.append(space.repeat(nbspace) + "BinTreePtr " + tokens[1] + " = std::make_unique<Node>();\n");
                            }
                            else if (tokens[3].matches(regexSym)) {
                                body.append(space.repeat(nbspace) + "BinTreePtr " + tokens[1] + " = std::make_unique<Leaf>(\"" + tokens[3] + "\");\n");
                            }
                            else if (tokens[3].matches(regexVar)) {
                                body.append(space.repeat(nbspace) + "auto " + tokens[1] + " = std::move(" + format(tokens[3]) + "->clone());\n");
                            }
                            else {
                                body.append(space.repeat(nbspace) + "auto " + tokens[1] + " = std::move(" + tokens[3] + ");\n");
                            }
                            break;
                        case 5:
                            if (tokens[3].equals("cons")) {
                                body.append(space.repeat(nbspace) + "auto " + tokens[1] + " = std::move(" + tokens[4] +");\n");
                            }
                            else if (tokens[3].equals("hd")) {
                                body.append(space.repeat(nbspace) + "auto " + tokens[1] + " = std::move(" + tokens[4] + "->hd());\n");
                            }
                            else if (tokens[3].equals("tl")) {
                                body.append(space.repeat(nbspace) + "auto " + tokens[1] + " = std::move(" + tokens[4] + "->tl());\n");
                            }
                            break;
                        case 6:
                            if (tokens[3].equals("call")) {
                                body.append(space.repeat(nbspace) + "auto " + tokens[1] + " = std::move(" + format(tokens[4]) + "());\n");
                            }
                            else if (tokens[4].equals("cons")) {
                                body.append(space.repeat(nbspace) + "auto " + tokens[1] + " = std::make_unique<Node>(std::move(" + tokens[3] + "), std::move(" + tokens[5] + "));\n");
                            }
                            else if (tokens[4].equals("equ")) {
                                //TODO
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
            else {
                if (tokens[0].equals("func")) {
                    break;
                }
                else {
                    if (tokens[0].contains("end")) {
                        nbspace--;
                        body.append(space.repeat(nbspace) +"}\n\n");
                    }
                    else if (tokens[0].contains("false")) {
                        body.append(space.repeat(nbspace -1 ) + "} else {\n");
                    }
                }
            }
        }

        StringBuilder head = new StringBuilder();

        if (name.equals("main")) {
            nbspace--;
            head.append("int main(int argc, char** argv) {\n");
            head.append(space.repeat(nbspace) + "try {\n\n");
            nbspace++;
        }
        else {
            if (returns.size() > 1) {
                if (!headers.contains("<vector>")) {
                    headers.add("<vector>");
                }
                rettype.insert(0, "std::vector<");
                rettype.append(">");
            }
    
            head.append(rettype + " " + format(name) + "() {\n");
        }

        if (inputs.size() > 0) {
            head.append(space.repeat(nbspace) +"// récupère les inputs\n");
        }

        if (name.equals("main")) {
            head.append(space.repeat(nbspace) + "if (argc < " + (inputs.size() + 1) + ") {\n");
            nbspace++;
            head.append(space.repeat(nbspace) + "std::cerr << \"Not enough arguments: \" << (argc - 1) << \" given, " + inputs.size() + " needed\" << std::endl;\n");
            head.append(space.repeat(nbspace) + "return 1;\n");
            head.append(space.repeat(nbspace -1) + "} else if (argc > " + (inputs.size() + 1) + ") {\n");
            head.append(space.repeat(nbspace) + "std::cerr << \"Too many arguments: \" << (argc - 1) << \" given, " + inputs.size() + " needed\" << std::endl;\n");
            head.append(space.repeat(nbspace) + "return 1;\n");
            nbspace--;
            head.append(space.repeat(nbspace) + "}\n\n");
            for (int i = 0; i < inputs.size(); i++) {
                head.append(space.repeat(nbspace) + "BinTreePtr " + inputs.get(i) + " = std::move(Parser::parse(argv[" + (i + 1) + "]));\n");
            }
        }
        else {
            for (String input : inputs) {
                head.append(space.repeat(nbspace) + "BinTreePtr " + input + " = std::move(_stack.top());\n");
                head.append(space.repeat(nbspace) + "_stack.pop();\n");
            }
        }
        head.append("\n");

        if (locals.size() > 0) {
            head.append(space.repeat(nbspace) + "// initialise les variables locales\n");
        }

        for (String local : locals) {
            head.append(space.repeat(nbspace) +"BinTreePtr " + local + " = std::make_unique<Node>();\n");
        }

        head.append("\n");
        head.append(body);
        head.append("\n");

        if (name.equals("main")) {
            head.append(space.repeat(nbspace) +"// affiche les résultats\n");
            for (String ret : returns) {
                head.append(space.repeat(nbspace) +"std::cout << " + ret + " << std::endl;\n");
            }
            head.append("\n" + space.repeat(nbspace) + "return 0;\n");
        }
        else {
            head.append(space.repeat(nbspace) +"// retourne les résultats\n");

            if (returns.size() == 1) {
                head.append(space.repeat(nbspace) +"return std::move(" + returns.pop() + ");\n");
            }
            else if (returns.size() > 1) {
                head.append(space.repeat(nbspace) +"std::vector<BinTreePtr> ret;\n");
                while (!returns.isEmpty()) {
                    String ret = returns.pop();
                    if (returns.contains(ret)) {
                        head.append(space.repeat(nbspace) +"ret.push_back(std::move(" + ret + "->clone()));\n");
                    }
                    else {
                        head.append(space.repeat(nbspace) +"ret.push_back(std::move(" + ret + "));\n");
                    }
                }
                head.append(space.repeat(nbspace) +"return std::move(ret);\n");
            }
        }

        if (name.equals("main")) {
            head.append(space.repeat(nbspace -1) + "} catch (std::invalid_argument& e) {\n");
            head.append(space.repeat(nbspace) + "std::cerr << e.what() << std::endl;\n");
            head.append(space.repeat(nbspace) + "return 1;\n");
            head.append(space.repeat(nbspace -1 ) + "}\n");
        }

        head.append("}\n\n");

        return head;
    }


    private String format(String str) {
        return str.replace("!", "_1")
            .replace("?", "_2")
            + '_';
    }

}
