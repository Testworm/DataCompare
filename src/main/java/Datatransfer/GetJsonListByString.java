package Datatransfer;
import java.awt.image.Kernel;
import java.util.*;

import net.sf.json.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.*;

public class GetJsonListByString {
    public static List<Map<String, String>> GetJsonListByString(String jsonFile)
    {

        JSONArray arry = JSONArray.fromObject(jsonFile);
        List<Map<String, String>> rsList = new ArrayList<Map<String, String>>();
        for (int i = 0; i < arry.size(); i++)
        {
            JSONObject jsonObject = arry.getJSONObject(i);
            Map<String, String> map = new HashMap<String, String>();
            for (Iterator<?> iter = jsonObject.keys(); iter.hasNext();)
            {
                String key = (String) iter.next();
                String value = jsonObject.get(key).toString();
                map.put(key, value);
            }
            rsList.add(map);
        }
        return rsList;
    }

    /* 数据比较函数：此方法仅适用于字段值一致的select查询结果;
    具体实现步骤：1.接收入参，将参数转化为List<Map<>>;
                2.迭代List中的Map进行比较
                3.打印异常值；即不同的值打印出来
    */
    public static void datasCompare(String str1, String str2){
        List<Map<String, String>> rsList1 = new ArrayList<Map<String, String>>();
        List<Map<String, String>> rsList2 = new ArrayList<Map<String, String>>();
        rsList1 = GetJsonListByString(str1);
        rsList2 = GetJsonListByString(str2);
//        System.out.println(rsList1);
//        System.out.println(rsList2);

        Iterator it1 = rsList1.iterator();
        Iterator it2 = rsList2.iterator();
        while (it1.hasNext()&&it2.hasNext()){
            Map map1 = (Map) it1.next();
            Map map2 = (Map) it2.next();
            if(map1.size()!=map2.size()){
                System.out.println("长度不匹配");
            }
            else {
                Set keySets = new HashSet<>();
                keySets = map1.keySet();
                Iterator itSet = keySets.iterator();
                while (itSet.hasNext()){
                    String key = (String) itSet.next();
                    if(map1.get(key).equals(map2.get(key))){    // equals 用于String; == 用于整型
                        System.out.println(key + ": PASS");
                    }
                    else {
                        System.out.println("-------------NOT PASS---------------");
                        System.out.println(key+": NOT PASS");
                        System.out.println(key+": "+ map1.get(key));
                        System.out.println(key+": "+ map2.get(key));
                        System.out.println("-------------NOT PASS---------------");

                    }

                }

            }
        }
    }


//    public static void main(String[] args) {
//        String str1 = "[{init_date=20190909, account=2009, amount1=50},{init_date=20190909, account=2009, amount1=50}]";
//        String str2 = "[{init_date=20190909, account=2008, amount1=49},{init_date=20190909, account=2009, amount1=50}]";
////        List<Map<String, String>> rsList1 = new ArrayList<Map<String, String>>();
////        List<Map<String, String>> rsList2 = new ArrayList<Map<String, String>>();
////        rsList1 = GetJsonListByString(str1);
////        rsList2 = GetJsonListByString(str2);
////        System.out.println(rsList1);
////        System.out.println(rsList2);
////
////        Iterator it1 = rsList1.iterator();
////        Iterator it2 = rsList2.iterator();
////        while (it1.hasNext()&&it2.hasNext()){
////            Map map1 = (Map) it1.next();
////            Map map2 = (Map) it2.next();
////            if(map1.size()!=map2.size()){
////                System.out.println("长度不匹配");
////            }
////            else {
////                Set keySets = new HashSet<>();
////                keySets = map1.keySet();
////                Iterator itSet = keySets.iterator();
////                while (itSet.hasNext()){
////                    String key = (String) itSet.next();
////                    if(map1.get(key).equals(map2.get(key))){    // equals 用于String; == 用于整型
////                        System.out.println(key + ": PASS");
////                    }
////                    else {
////                        System.out.println(key+": NOT PASS");
////                        System.out.println(key+": "+ map1.get(key));
////                        System.out.println(key+": "+ map2.get(key));
////                    }
////
////                }
////
////            }
////        }
////        datasCompare(str1, str2);
//
//
//
//    }

}
