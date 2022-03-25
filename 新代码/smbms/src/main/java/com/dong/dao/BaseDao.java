package com.dong.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

//操作数据库的公共类
public class BaseDao {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;
    static{
        //通过类加载器读取资源
        InputStream is = BaseDao.class.getClassLoader().getResourceAsStream("db.properties");
        Properties pro = new Properties();
        try {
            pro.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = pro.getProperty("driver");
        url= pro.getProperty("url");
        username= pro.getProperty("username");
        password= pro.getProperty("password");
    }
    //获取数据库链接
    public static Connection getconnection(){
        Connection conn=null;
        try {
             Class.forName(driver);
             conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }
    //编写查询公共类
    public static ResultSet execute(Connection conn,String sql,Object[] params, ResultSet resultSet,PreparedStatement preparedStatement) throws SQLException {
             preparedStatement = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }
            resultSet = preparedStatement.executeQuery();
            return resultSet;
    }
    //编写增删改公共方法
    public static int update(Connection conn,PreparedStatement preparedStatement,String sql,Object[] params) throws SQLException {
        preparedStatement = conn.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject(i + 1, params[i]);
        }
        int update = preparedStatement.executeUpdate();
        return update;
    }
    //释放资源
    public static boolean resourceclose(Connection conn,PreparedStatement preparedStatement,ResultSet resultSet){
        boolean flag=true;
        if (resultSet!=null){
            try {
                resultSet.close();
                //GC回收
                resultSet=null;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                flag=false;
            }
        }
        if (preparedStatement!=null){
            try {
                preparedStatement.close();
                preparedStatement=null;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                flag=false;
            }
        }
        if (conn!=null){
            try {
                conn.close();
                conn=null;
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                flag=false;
            }
        }
        return flag;
    }
}
