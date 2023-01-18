import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Code3aToCpp {

    private List<String[]> code3a;
    private BufferedWriter writer = null;

    private Set<String> headers = new HashSet<String>();

    private static final String regexSym = "(?:[a-z])(?:[A-Z]|[a-z]|[0-9])*(?:[!]|[?])?";
    private static final String regexVar = "(?:[A-Z])(?:[A-Z]|[a-z]|[0-9])*(?:[!]|[?])?";
    private static final String regexReg = "(?:_R)(?:[0-9])+";
    private static final String regexTmp = "(?:_i)(?:[0-9])+";

    public Code3aToCpp(List<String[]> code3a) {
        this.code3a = code3a;
    }

    public void generate(String outputName) throws IOException {
        writer = new BufferedWriter(new FileWriter(outputName));

        String funcName = "";
        List<String> inputs = new LinkedList<String>();
        List<String> returns = new LinkedList<String>();
        Set<String> locals = new HashSet<String>();
        StringBuilder tmp = new StringBuilder();

        String indent = "    ";
        int indentLevel = 1;
        

        for (String[] line : code3a) {
            switch (line[0]) {
                case "func":
                    if (line[1].equals("begin")) {
                        funcName = line[2];
                        if (funcName.equals("main")) {
                            indentLevel++;
                        }
                    }
                    else {
                        if (funcName.equals("main")) {
                            indentLevel--;
                        }
                        inputs.clear();
                        returns.clear();
                        locals.clear();
                        tmp = new StringBuilder();
                    }
                    break;
                case "input":
                    inputs.add(line[1]);
                    break;
                case "return":
                    returns.add(line[1]);
                    break;
                case "store":
                    tmp.append(indent.repeat(indentLevel));
                    if (line[2].matches(regexVar) &&
                            !(locals.contains(line[2]) || inputs.contains(line[2]))) {
                        locals.add(line[2]);
                    }
                    if (line[1])
                    
            }
        }
    }


    private String format(String str) {
        return str.replace("!", "_1")
            .replace("?", "_2")
            + '_';
    }

}
