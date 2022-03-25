package com.Dao;

import com.it.User;
import com.tool.Tool;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    private JdbcTemplate template = new JdbcTemplate(Tool.getDataSource());

    public void Regist(User user) {
        String sql = "insert into user(username,passwrod) values(?,?)";
        int update = template.update(sql, user.getUsername(), user.getPassword());
        if (update > 0) {
            System.out.println("注册成功");
        } else {
            System.out.println("注册失败");
        }
    }
}
