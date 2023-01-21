import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;


public class Code3aToCpp {

    private BufferedWriter header = null;
    private BufferedWriter source = null;

    private static final String regexSym = "(?:[a-z])(?:[A-Z]|[a-z]|[0-9])*(?:[!]|[?])?";
    private static final String regexVar = "(?:[A-Z])(?:[A-Z]|[a-z]|[0-9])*(?:[!]|[?])?";
    private static final String regexReg = "(?:_R)(?:[0-9])+";

    private Table table;
    private List<String[]> code;
    private static final String indent = "    ";

    private Map<String, StringBuilder> funbody = new HashMap<String, StringBuilder>();

    public Code3aToCpp(List<String[]> code) {
        this.code = code;
    }

    public void generate(String inputName, Table table) throws IOException {
        File f = new File(inputName);
        header = new BufferedWriter(new FileWriter(inputName + ".h"));
        source = new BufferedWriter(new FileWriter(inputName + ".cpp"));
        this.table = table;

        generateHeader(f.getName());
        generateFunBodies();
        generateSource(f.getName());
       
    }

    private void generateHeader(String inputName) throws IOException {
        String guard = "WHILEC_GENERATED_" + inputName.toUpperCase()
            .replace('.', '_')
            .replace('-', '_') + "_H";

        header.write("#ifndef " + guard);
        header.newLine();
        header.write("#define " + guard);
        header.newLine();
        header.newLine();
        header.write("#include <whilestd/whilestd.h>");
        header.newLine();
        header.newLine();

        Set<String> functions = table.getFunctions();

        if (functions.size() > 1) {
            header.write("namespace {");
            header.newLine();
            header.newLine();

            for (String fun : functions) {
                if (!fun.equals("main")) {
                    header.write("whilestd::BinTreePtr " + format(fun) + " (");
                    Set<String> inputs = table.getInputs(fun);
                    
                    for (int i = inputs.size() -1; i >= 0; i--) {
                        header.newLine();
                        header.write(indent);
                        header.write("whilestd::BinTreePtr " + format(inputs.toArray()[i].toString()));
                        if (i > 0) {
                            header.write(",");
                        }
                    }

                    header.write(");");
                    header.newLine();
                    header.newLine();
                }
            }

            header.write("} // namespace");
            header.newLine();
            header.newLine();
        }


        header.write("#endif // " + guard);
        header.newLine();

        header.close();
    }

    private void generateSource(String inputName) throws IOException {
        source.write("#include \"" + inputName + ".h\"");
        source.newLine();
        source.newLine();

        Set<String> functions = table.getFunctions();

        if (functions.size() > 1) {
            source.write("namespace {");
            source.newLine();
            source.newLine();

            for (String fun : functions) {
                if (!fun.equals("main")) {
                    source.write("whilestd::BinTreePtr " + format(fun) + " (");
                    Set<String> inputs = table.getInputs(fun);
                    
                    for (int i = inputs.size() -1; i >= 0; i--) {
                        source.newLine();
                        source.write(indent.repeat(2));
                        source.write("whilestd::BinTreePtr " + format(inputs.toArray()[i].toString()));
                        if (i > 0) {
                            source.write(",");
                        }
                    }

                    source.write(") {");
                    source.newLine();
                    source.write(funbody.get(fun).toString());
                    source.write("}");
                    source.newLine();
                    source.newLine();
                }
            }

            source.write("} // namespace");
            source.newLine();
            source.newLine();
            source.write(funbody.get("main").toString());
            source.close();
        }

    }

    private void generateFunBodies() {
        int nbIndent = 1;
        String fun = "";
        StringBuilder body = new StringBuilder();
        Set<String> inputs = null;
        Set<String> locals = null;
        Queue<String> params = new LinkedList<String>();
        
        for (String[] line : code) {
            switch (line[0]) {
                case "func":
                    if (line[1].equals("end")) {
                        if (fun.equals("main")) {
                            nbIndent = 1;
                            body.append(indent.repeat(3) + "return 0;\n");
                            body.append(indent.repeat(2) + "} catch (std::invalid_argument& e) {\n");
                            body.append(indent.repeat(3) + "std::cerr << e.what() << \'\\n\';\n");
                            body.append(indent.repeat(2) + "}\n");
                            body.append(indent + "}\n");
                            body.append(indent + "return 1;\n");
                            body.append("}\n");
                        }
                        funbody.put(fun, new StringBuilder(body));
                        body = new StringBuilder();
                    } else {
                        fun = line[2];
                        inputs = table.getInputs(fun);
                        locals = new HashSet<String>(table.getLocals(fun));
                        if (fun.equals("main")) {
                            body.append("int main(int argc, char** argv) {\n");
                            body.append(indent + "if (argc < " + (inputs.size() + 1) + ") {\n");
                            body.append(indent.repeat(2) 
                                + "std::cerr << \"Not enough arguments: \" << (argc - 1) << \" given, " 
                                + inputs.size() + " needed\\n\";\n");
                            body.append(indent + "} else if (argc > " + (inputs.size() + 1) + ") {\n");
                            body.append(indent.repeat(2) 
                                + "std::cerr << \"Too many arguments: \" << (argc - 1) << \" given, " 
                                + inputs.size() + " needed\\n\";\n");
                            body.append(indent + "} else {\n");
                            body.append(indent.repeat(2) + "try {\n");
                            nbIndent += 2;
                        }
                        body.append(indent.repeat(nbIndent) + "// init locals\n");
                        for (String local : locals) {
                            body.append(indent.repeat(nbIndent) + "whilestd::BinTreePtr " 
                                + format(local) + " = std::make_unique<whilestd::Node>();\n");
                        }
                        body.append("\n");

                    }
                    break;
                case "parse":
                    body.append(indent.repeat(nbIndent) + "auto " 
                        + format(line[1]) + " = whilestd::Parser::parse(argv[" 
                        + (Integer.valueOf(line[2]) + 1) + "]);\n");
                    break;
                case "print":
                    body.append(indent.repeat(nbIndent) + "std::cout << *" 
                        + format(line[1]) + " << \'\\n\';\n");
                    break;
                case "param":
                    params.add(line[1]);
                    break;
                case "call":
                    body.append(indent.repeat(nbIndent) + "auto " + line[1] + " = " + format(line[2]) + "(\n");
                    for (int i = Integer.valueOf(line[3]) - 1; i >= 0; i--) {
                        body.append(indent.repeat(nbIndent + 1) 
                            + params.poll() + "->clone()");
                        if (i > 0) {
                            body.append(",\n");
                        }
                    }
                    body.append(");\n");
                    break;
                case "return":
                    body.append("\n");
                    body.append(indent.repeat(nbIndent) + "return ");
                    if (line[1].matches(regexVar)) {
                        body.append(format(line[1]));
                    } else if (line[1].equals("nil")) {
                        body.append("std::make_unique<whilestd::Node>()");
                    } else {
                        body.append(line[1]);
                    }
                    body.append(";\n");
                    break;
                case "store":
                    body.append(indent.repeat(nbIndent));
                    if (line[1].matches(regexReg) && !locals.contains(line[1])) {
                        body.append(line[2].matches(regexSym)
                            ? "whilestd::BinTreePtr " : "auto ");
                        locals.add(line[1]);
                    }
                    body.append(format(line[1]) + " = ");
                    if (line[2].matches(regexVar)) {
                        body.append(format(line[2]) + "->clone()");
                    } else if (line[2].equals("nil")) {
                        body.append("std::make_unique<whilestd::Node>()");
                    } else if (line[2].matches(regexSym)) {
                        body.append("std::make_unique<whilestd::Leaf>(\"" + line[2] + "\")");
                    } else {
                        body.append(line[2] + "->clone()");
                    }
                    body.append(";\n");
                    break;
                case "cons":
                    body.append(indent.repeat(nbIndent));
                    if (line[1].matches(regexReg) && !locals.contains(line[1])) {
                        body.append("whilestd::BinTreePtr ");
                        locals.add(line[1]);
                    }
                    body.append(format(line[1]) + " = std::make_unique<whilestd::Node>(" 
                        + format(line[2]) + "->clone(), " + format(line[3]) + "->clone());\n");
                    break;
                case "hd":
                    body.append(indent.repeat(nbIndent));
                    if (line[1].matches(regexReg) && !locals.contains(line[1])) {
                        body.append("auto ");
                        locals.add(line[1]);
                    }
                    body.append(format(line[1]) + " = " + line[2] + "->hd();\n");
                    break;
                case "tl":
                    body.append(indent.repeat(nbIndent));
                    if (line[1].matches(regexReg) && !locals.contains(line[1])) {
                        body.append("auto ");
                        locals.add(line[1]);
                    }
                    body.append(format(line[1]) + " = " + line[2] + "->tl();\n");
                    break;
                case "equ":
                    body.append(indent.repeat(nbIndent));
                    if (line[1].matches(regexReg) && !locals.contains(line[1])) {
                        body.append("auto ");
                        locals.add(line[1]);
                    }
                    body.append(format(line[1]) + " = *" + line[2] + " == *" + line[3] + ";\n");
                    break;
                case "ifz":
                    body.append("\n" + indent.repeat(nbIndent));
                    if (line[2].contains("loop")) {
                        body.append("while (");
                    } else {
                        body.append("if (");
                    }
                    body.append("*" + line[1] + ") {\n");
                    nbIndent++;
                    break;
                case "label":
                    if (line[1].contains("end")) {
                        nbIndent--;
                        body.append(indent.repeat(nbIndent) + "}\n\n");
                    }
                    else if (line[1].contains("false")) {
                        body.append(indent.repeat(nbIndent - 1) + "} else {\n");
                    }
                    break;
                case "goto":
                case "nop":
                default:
                    break;
            }
        }
    }

    private String format(String str) {
        if (str.matches(regexReg)) {
            return str;
        }
        return str.replace("!", "_1")
            .replace("?", "_2")
            + '_';
    }

}
