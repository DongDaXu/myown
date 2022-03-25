package com.dong.service;

import com.dong.dao.UserDao;


public class ServiceImpl implements Service{


    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.save();
    }
}
