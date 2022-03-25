package com.dong.dao;

import com.dong.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
  List<User> getUsers();
    @Select("select * from user where id=#{id}")
    User getUserById( int id);
    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{pwd})")
    int addUser(User user);
}
