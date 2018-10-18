package setUtil;
import java.util.HashSet;
import java.util.Set;

public class setUtil {
    public Set joinRes(Set  setA, Set  setB){
        Set result = new HashSet();
        result.clear();
        result.addAll(setA);
        result.retainAll(setB);

        return result;
    }

    public Set difRes(Set setA, Set setB){
        Set result = new HashSet();
        result.clear();
        result.addAll(setA);
        result.remove(setB);
        return result;
    }

    public Set unionRes(Set setA, Set setB){
        Set result = new HashSet();
        result.clear();
        result.addAll(setA);
        result.addAll(setB);
        return result;
    }
}
