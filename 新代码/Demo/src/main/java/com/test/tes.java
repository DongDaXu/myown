package com.test;

import com.Dao.UserDao;
import com.it.User;
import org.junit.Test;

public class tes {
    @Test
    public void TestUserDao() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("125");
        UserDao ud = new UserDao();
        ud.Regist(user);
    }
}
