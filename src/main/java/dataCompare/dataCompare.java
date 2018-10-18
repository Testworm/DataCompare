package dataCompare;
import java.util.Collections;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.lang.String;
import org.apache.commons.collections.*;
import org.apache.commons.collections.ComparatorUtils;


public class dataCompare {

    public static void main(String[] args){
        String res_1 = "[{init_date=20190909, account=2008, amount1=49}]";
        String res_2 = "[{init_date=20190919, account=2008, amount1=49}]";
        Collection  list_1 = new ArrayList<String>();
        Collection  list_2 = new ArrayList<String>();
        list_1.add(res_1);
        list_2.add(res_2);
        boolean res = list_1.contains(list_2);


        System.out.println(res);
        System.out.println(res_1.contains(res_2));
    }











}
