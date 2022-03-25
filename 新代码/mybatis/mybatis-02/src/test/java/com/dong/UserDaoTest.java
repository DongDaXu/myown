package com.dong;

import com.dong.dao.UserMapper;
import com.dong.pojo.User;
import com.dong.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void testid(){
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userByid = mapper.getUserByid(2);
        System.out.println(userByid);
        sqlSession.close();
    }
    @Test
    public void testadd(){
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addUser(new User(1, "劳力", "1234567"));
        if (i>0){
            System.out.println("插入成功");
            sqlSession.commit();
        }
        sqlSession.close();
    }
    @Test
    public void testupdate(){
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.update(new User(1, "老白", "123"));
        if (i>0){
            System.out.println("修改成功");
            sqlSession.commit();
        }
        sqlSession.close();
    }
    @Test
    public void testdelete(){
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(1);
        if (i>0){
            System.out.println("删除成功");
            sqlSession.commit();
        }
        sqlSession.close();
    }
    @Test
    public void testname(){
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userBylike = mapper.getUserBylike("%李%");
        System.out.println(userBylike);
    }
}
