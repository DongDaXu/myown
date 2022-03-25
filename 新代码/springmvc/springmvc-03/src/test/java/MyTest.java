import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class MyTest {
    @Test
    public void test() throws PropertyVetoException {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mybatis");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        jdbcTemplate.update("insert  into user values (?,?,?)",200,"tom","125894");
    }
    //测试spring产生jdbc模板对象
    @Test
    public void test02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
        jdbcTemplate.update("insert  into user values (?,?,?)",166,"Alex","11568");
    }
}
