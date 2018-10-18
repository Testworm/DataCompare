package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class CollectionUtil {
    private static final int getFreq(final Object obj, final Map freqMap) {
        Integer count = (Integer) freqMap.get(obj);
        if (count != null) {
            return count.intValue();
        }
        return 0;
    }
    public static void main(String[] args){
        String key = "key";
        Map map = new HashMap();
        map.put("key", 5);
        System.out.println(getFreq(key,map));

    }
}
