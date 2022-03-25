package com.kuang.dao;

import org.springframework.stereotype.Component;


public class UserDaoImpl implements UserDao{
    public void save() {
        System.out.println("方法运行了");
    }
}
