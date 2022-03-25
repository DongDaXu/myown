package com.dong.listen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext=servletContextEvent.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext context=new ClassPathXmlApplicationContext(contextConfigLocation);
        servletContext.setAttribute("context",context);
        System.out.println("初始化完毕");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
