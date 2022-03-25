package com.dong.service;

import com.dong.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("service")
public class ServiceImpl implements Service{
   @Autowired
   @Qualifier("userDao")
    private UserDao userDao;
    public void init(){
        System.out.println("方法初始化");
    }
    public void destory(){
        System.out.println("方法销毁");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.save();
    }
}
