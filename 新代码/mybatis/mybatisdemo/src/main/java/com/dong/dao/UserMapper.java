package com.dong.dao;

import com.dong.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
    //根据ID查询用户
    User getUserByid(int id);
    //insert用户
    int addUser(User user);
    //map用户
    int getUserBymap(Map<String,Object> map);
    //更新用户信息
    int update(User user);
    //删除用户
    int deleteUser(int id);
    //模糊查询
    User getUserBylike(String name);
}
