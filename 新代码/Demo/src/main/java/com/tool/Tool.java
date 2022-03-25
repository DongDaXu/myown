package com.tool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class Tool {
    private static DataSource ds;

    static {
        try {
            Properties pro = new Properties();
            InputStream res = Tool.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(res);
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return ds;
    }

    public static Connection getconnection() throws SQLException {
        return ds.getConnection();
    }
}
