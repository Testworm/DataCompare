package JdbcDriver;

import JdbcDriver.ConnMysql;
import JdbcDriver.DDLSQL;
import java.util.Collection;


public class SqlTest {
    public static void main(String[] args){
        //实例化对象
        DDLSQL vs = new DDLSQL();
        //调用查询方法
        vs.Select("select * from data_stock1");
        System.out.println();


    }
}
