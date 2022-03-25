package com.dong.dao;

import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao{
    public void save() {
        System.out.println("方法运行了");
    }
}
