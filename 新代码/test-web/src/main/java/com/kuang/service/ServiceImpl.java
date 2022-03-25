package com.kuang.service;

import com.kuang.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class ServiceImpl implements Service{


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
