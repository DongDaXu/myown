package com.dong;

import com.dong.dao.UserMapper;
import com.dong.pojo.User;
import com.dong.utils.MyBatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUsers();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void testbyid(){
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(2);
        System.out.println(userById);
    }
    @Test
    public void testadd(){
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addUser(new User(18, "打", "123876"));
    }
}