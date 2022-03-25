package com.itcast;

import java.sql.*;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取链接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
        //4.获取执行者对象
        Statement stat = conn.createStatement();
        //5.执行sql语句，并且接受结果
        String sql="select * from dept";
        ResultSet rs = stat.executeQuery(sql);
        //6.处理结果
        while (rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("dname"));
            System.out.println(rs.getString("loc"));
        }
        //7.释放资源
        rs.close();
        stat.close();
        conn.close();
    }
}
