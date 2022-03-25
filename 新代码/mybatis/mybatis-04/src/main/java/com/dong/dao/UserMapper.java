package com.dong.dao;

import com.dong.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
    //分页
    List<User> getUserLimit(Map<String,Integer> map);
    //
    List<User> getUserByRowbouns();
}
