package com.dong.servl;

import com.dong.listen.WebApplication;
import com.dong.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        //ApplicationContext context= (ApplicationContext) servletContext.getAttribute("context");
        //ApplicationContext context = WebApplication.getWebAppication(servletContext);
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        Service con = context.getBean(Service.class);
        con.getUser();

    }
}
