package com.dong.service;

import com.dong.pojo.User;

public interface UserService {
    public String sayHello();
    /**
     * 查询用户
     */
    public User finUserbyid(int i);
}
