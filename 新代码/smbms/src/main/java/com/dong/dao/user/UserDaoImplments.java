package com.dong.dao.user;

import com.dong.dao.BaseDao;
import com.dong.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImplments implements UserDao{
    //得到登录用户
    public User getLoginUser(Connection connection, String userCode) {
        PreparedStatement pre=null;
        ResultSet res=null;
        User user=null;
        try {
        if (connection!=null) {
            String sql = "select * from smbms_user where userCode=?";
            Object[] params = {userCode};
            res=BaseDao.execute(connection,sql,params,res,pre);
                if (res.next()){
                    user = new User();
                    user.setId(res.getInt("id"));
                    user.setUserCode(res.getString("userCode"));
                    user.setUserName(res.getString("userName"));
                    user.setUserPassword(res.getString("userPassword"));
                    user.setGender(res.getInt("gender"));
                    user.setBirthday(res.getDate("birthday"));
                    user.setPhone(res.getString("phone"));
                    user.setAddress(res.getString("address"));
                    user.setUserRole(res.getInt("userRole"));
                    user.setCreatedBy(res.getInt("createdBy"));
                    user.setCreationDate(res.getTimestamp("creationDate"));
                    user.setModifyBy(res.getInt("modifyBy"));
                    user.setModifyDate(res.getTimestamp("modifyDate"));
                }
            }
            BaseDao.resourceclose(null,pre,res);
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
      return user;
    }
    //修改用户密码
    public int updatePwd(Connection conn,int id,int passwrod) throws SQLException {
        PreparedStatement pre=null;
        int excute=0;
        if (conn!=null){
            String sql="update smbms_user set userPassword = ? where id=?";
            Object params[]={passwrod,id};
            excute = BaseDao.update(conn, pre, sql, params);
            BaseDao.resourceclose(null,pre,null);
        }
        return excute;
    }
}
