package Collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ComparatorUtils;
import org.apache.commons.collections.iterators.ArrayIterator;
import org.apache.commons.collections.iterators.ArrayListIterator;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class ListMap {

    public static void main(String[] args){
        List<Map<String, Integer>> list1 = new ArrayList<>();
        List<Map<String, Integer>> list2 = new ArrayList<>();

//        list.add("hello");
//        list.add("ahah");
//        list.add("world");
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("age", 20);
        map1.put("salary", 100);
        list1.add(map1);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("age", 20);
        map2.put("salary", 90);
        list1.add(map2);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("age", 20);
        map3.put("salary", 90);
        list2.add(map1);
        Map<String, Integer> map4 = new HashMap<>();
        map4.put("age", 20);
        map4.put("salary", 100);
        list2.add(map2);
        System.out.println(list1);
//        System.out.println(CollectionUtils.disjunction(list1, list2));
        Set set1 = new HashSet();
        set1.add(map1);
        System.out.println(set1);
        Set set2 = new HashSet();
        set2.add(map2);
//        System.out.println(CollectionUtils.retainAll(list1,list2));
        System.out.println(list1.subList(0,1));













    }


}
