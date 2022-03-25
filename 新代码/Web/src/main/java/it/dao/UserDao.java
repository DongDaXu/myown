package it.dao;

import it.itcast.User;
import it.too.JDBCUntil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    private  JdbcTemplate template=new JdbcTemplate(JDBCUntil.getdata());
    public User Ce(User loginuser){
        try {
            String sql="select * from user where username = ? and password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), loginuser.getUsername(), loginuser.getPasswrod());
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
