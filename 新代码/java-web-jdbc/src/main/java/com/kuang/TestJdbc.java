package com.kuang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJdbc {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=utf-8";
        String user="root";
        String password="root";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stat = conn.createStatement();
        String sql="select * from smbms_address";
        ResultSet res = stat.executeQuery(sql);
        while (res.next()){
            System.out.println("id="+res.getObject("id"));
            System.out.println("contact="+res.getObject("contact"));
            System.out.println("addressDesc="+res.getObject("addressDesc"));
            System.out.println("postCode="+res.getObject("postCode"));
        }
        res.close();
        stat.close();
        conn.close();
    }
}
