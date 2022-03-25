package com.it;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        //得到session
        HttpSession session = req.getSession();
        //给session中存东西
        session.setAttribute("name","秦疆");
        String sessionId = session.getId();
        if (session.isNew()){
            resp.getWriter().write("session创建成功,id+"+sessionId);
        }else {
            resp.getWriter().write("session已经在服务器中存在了"+sessionId);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
