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
    static Logger logger=Logger.getLogger(String.valueOf(UserDaoTest.class));
    @Test
    public void test() {
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void testlog(){
        logger.info("info:进入了log4j");
    }
    @Test
    public void testlimit(){
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userLimit = mapper.getUserLimit(map);
        for (User user : userLimit) {
            System.out.println(user);
        }
    }
    @Test
    public void getUserByRowbouns(){
        //RowBounds实现
        RowBounds rowBounds = new RowBounds(1, 2);

        //通过java代码层面实现分页
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        List<User> userList = sqlSession.selectList("com.dong.dao.UserMapper.getUserByRowbouns",null,rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}