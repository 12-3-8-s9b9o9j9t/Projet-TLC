import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SpaghettiStack {

    String name;
    //List<SpaghettiStack> childBlocks;
    Map<String, List<Integer>> symbols;

    public SpaghettiStack(String name) {
        this.name = name;
        //this.childBlocks = new LinkedList<SpaghettiStack>();
        this.symbols = new LinkedHashMap<String, List<Integer>>();
    }
    /*
      public List<SpaghettiStack> getChildBlocks() {
        return this.childBlocks;
    }
    */
    public Map<String, List<Integer>> getSymbols() {
        return this.symbols;
    }

    public boolean alreadyDeclared(String name) {
        return symbols.containsKey(name);
    }

    public void addSymbolsToCurrentBlock(String name, int line) {
        List<Integer> l = this.symbols.get(name);
        if (l == null) {
            l = new LinkedList<Integer>();
            this.symbols.put(name, l);
        }
        l.add(line);
    }
    /* 
    public void addChildToCurrentblock(SpaghettiStack stack) {
        childBlocks.add(stack);
    }
    */
    public String toString() {
        return name;
    }
}
