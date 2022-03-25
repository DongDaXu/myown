package it.too;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUntil {
    private static DataSource ds;
    static {
        try {
            Properties pro=new Properties();
            InputStream res = JDBCUntil.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(res);
            ds= DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getdata(){
        return ds;
    }
    public static Connection getconnection() throws SQLException {
        return ds.getConnection();
    }

}
