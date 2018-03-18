package com.wzj.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMysql
{

    public static void main(String[] args)
    {
        conectMysql();

    }

    public static void conectMysql()
    {
        //加载jdbc驱动类
        Connection conn = null;
        ResultSet rs = null;
        try
        {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //获取数据库的连接
            conn = DriverManager.getConnection("jdbc:mysql://192.168.3.45:3306/wzj","root","passwd");

            //得到代表SQL语句的对象
            Statement stmt = conn.createStatement();

            //执行sql语句
            rs = stmt.executeQuery("SELECT * FROM teacher");

            //把数据打印出来
            while (rs.next())
            {
                System.out.println(rs.getObject("tec_id"));
                System.out.println(rs.getObject("tec_name"));
                System.out.println(rs.getObject("tec_age"));
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //把这两个流关闭
                conn.close();
                rs.close();
            }
            catch (SQLException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

        System.out.println("conn的具体类型是："+conn.getClass().getName());
    }

}
