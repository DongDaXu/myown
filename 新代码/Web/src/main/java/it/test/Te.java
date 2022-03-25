package it.test;

import it.dao.UserDao;
import it.itcast.User;
import org.junit.Test;

public class Te {
    @Test
    public void tes(){
        User user=new User();
        user.setUsername("superbaby");
        user.setPasswrod("123");
        UserDao us=new UserDao();
        us.Ce(user);
        System.out.println(user);
    }
}
