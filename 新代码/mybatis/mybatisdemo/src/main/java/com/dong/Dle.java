package com.dong;

import com.dong.dao.UserMapper;
import com.dong.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Dle extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SqlSession sqlSession = MyBatisUtils.getsqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<com.dong.pojo.User> userList = mapper.getUserList();
       req.setAttribute("userList",userList);
        sqlSession.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
