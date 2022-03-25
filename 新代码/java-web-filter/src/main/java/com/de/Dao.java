package com.de;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Dao extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        if (username.equals("admin")){
            req.getSession().setAttribute("session_username",req.getSession().getId());
            System.out.println(req.getSession().getId());
           resp.sendRedirect("/010/sys/success.jsp");
        }else {
            resp.sendRedirect("/010/error.jsp");
        }
    }
}
