package com.dong.service.user;

import com.dong.dao.BaseDao;
import com.dong.dao.user.UserDao;
import com.dong.dao.user.UserDaoImplments;
import com.dong.pojo.User;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class UserServiceImpl implements UserService{
    //业务层都会调用Dao层，所以我们要引入Dao层
    private UserDao userDao;
    public UserServiceImpl() {
        userDao=new UserDaoImplments();
    }
    //用户层登录
    public User login(String userCode, String password) {
        Connection conn=null;
        User user=null;
        try {
            conn = BaseDao.getconnection();
            user = userDao.getLoginUser(conn, userCode);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.resourceclose(conn,null,null);
        }
        return user;
    }
    public boolean updatePwd(int id,int pwd){
        Connection conn=null;
        boolean flag=false;
        try {
            conn=BaseDao.getconnection();
            if (userDao.updatePwd(conn,id,pwd)>0){
                flag=true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            BaseDao.resourceclose(conn,null,null);
        }
    return flag;
    }
}
