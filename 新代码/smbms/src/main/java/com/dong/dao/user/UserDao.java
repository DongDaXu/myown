package com.dong.dao.user;

import com.dong.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;

public interface UserDao {
    public User getLoginUser(Connection connection,String userCode);
    public int updatePwd(Connection conn,int id,int passwrod) throws SQLException;
}
