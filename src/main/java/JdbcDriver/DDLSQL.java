package JdbcDriver;

import JdbcDriver.ConnMysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class DDLSQL {

    // 连接对象
    private Connection conn;
    // 传递sql语句
    private Statement stt;
    // 结果集
    private ResultSet set;
    // 查询
    public void Select(String Sql) {
        try {
            // 获取连接
            conn = ConnMysql.getConnection();
            if (conn == null)
                return;
            // 定义sql语句  查询
//            String Sql = "select * from data_stock1";
            // 执行sql语句
            stt = conn.createStatement();
            // 返回结果集
            set = stt.executeQuery(Sql);
            // 获取数据
            while (set.next()) {

                System.out.println("账户:" + set.getString(1) + "\t数量:"
                        + set.getString(2) + "日期:" + set.getString(3));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // 释放资源
            try {
                set.close();
                conn.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }

        }
    }

    // 增
    // 使用Statement接口的executeUpdate()方法向数据库添加数据
    public void Add(){
        try {
            //获取连接
            conn = ConnMysql.getConnection();
            if(conn==null)
                return;
            //获取用户输入的账号和密码
            Scanner input = new Scanner(System.in);
            System.out.print("请输入用户名:");
            int user = input.nextInt();
            System.out.print("请输入密码:");
            String pwd = input.next();
            //定义sql语句
            String sql = "insert into login values("+user+" , '"+pwd+"');";
            //获取Statement对象
            stt = conn.createStatement();
            //执行sql语句
            stt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //释放资源
            try {
                conn.close();
            } catch (Exception e2) {}
        }
    }

}