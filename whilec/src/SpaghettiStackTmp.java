import java.util.LinkedHashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;

public class SpaghettiStackTmp {

    public class Tuple<S1, S2, S3> {
        public S1 inputs;
        public S2 locals;
        public S3 outputs;
    }

    private Map<String, Tuple<Set<String>, Set<String>, List<String>>> symbols = 
        new LinkedHashMap<String, Tuple<Set<String>, Set<String>, List<String>>>();
    
    public Map<String, Tuple<Set<String>, Set<String>, List<String>>> getSymbols() {
        return this.symbols;
    }

    public boolean addStack(String funcName) {
        if (this.symbols.containsKey(funcName)) {
            return false;
        }
        Tuple<Set<String>, Set<String>, List<String>> l = new Tuple<Set<String>, Set<String>, List<String>>();
        l.inputs = new HashSet<String>();
        l.locals = new HashSet<String>();
        l.outputs = new LinkedList<String>();
        this.symbols.put(funcName, l);
        return true;
    }

    public boolean addInput(String varName, String funcName) {
        Set<String> in = this.symbols.get(funcName).inputs;
        return in.add(varName);
    }

    public boolean addLocal(String varName, String funcName) {
        Set<String> dec = this.symbols.get(funcName).locals;
        Set<String> in = this.symbols.get(funcName).inputs;
        if (in.contains(varName)) {
            return false;
        }
        return dec.add(varName);
    }

    public boolean addOutput(String varName, String funcName) {
        List<String> out = this.symbols.get(funcName).outputs;
        return out.add(varName);
    }
}
