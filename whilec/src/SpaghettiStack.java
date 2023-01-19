import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SpaghettiStack {

    public class Tuple<S1, S2, S3> {
        public S1 inputs;
        public S2 declared;
        public S3 outputs;
    }

    private Map<String, Tuple<List<String>, List<String>, List<String>>> symbols;

    public SpaghettiStack() {
        this.symbols = new LinkedHashMap<String, Tuple<List<String>, List<String>, List<String>>>();
    }
    
    public Map<String, Tuple<List<String>, List<String>, List<String>>> getSymbols() {
        return this.symbols;
    }

    public boolean alreadyDeclared(String name, String funcName) {
        return this.symbols.get(funcName).declared.contains(name);
    }

    public boolean alreadyDeclaredInput(String name, String funcName) {
        return this.symbols.get(funcName).inputs.contains(name);
    }

    public boolean alreadyDeclaredOutput(String name, String funcName) {
        return this.symbols.get(funcName).outputs.contains(name);
    }

    public void addInputsToCurrentBlock(String varName, int line, String funcName) {
        Tuple<List<String>, List<String>, List<String>> l = this.symbols.get(funcName);
        if (l == null) {
            l = new Tuple<List<String>, List<String>, List<String>>();
            this.symbols.put(funcName, l);
        }
        l.inputs.add(varName);
    }

    public void addOutputsToCurrentBlock(String varName, int line, String funcName) {
        Tuple<List<String>, List<String>, List<String>> l = this.symbols.get(funcName);
        l.outputs.add(varName);
    }

    public void addSymbolsToCurrentBlock(String varName, int line, String funcName) {
        Tuple<List<String>, List<String>, List<String>> l = this.symbols.get(funcName);
        l.declared.add(varName);
    }
}
