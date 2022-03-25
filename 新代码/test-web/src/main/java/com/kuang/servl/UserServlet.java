package com.kuang.servl;

import com.kuang.listen.WebApplication;
import com.kuang.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
//        ApplicationContext app = (ApplicationContext) servletContext.getAttribute("app");
        //Service bean = app.getBean(Service.class);
        ApplicationContext con = WebApplication.getWebAppication(servletContext);
        Service bean = con.getBean(Service.class);
        bean.getUser();

    }
}
