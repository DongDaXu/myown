package com.kuang.listen;
import com.kuang.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext= servletContextEvent.getServletContext();
        //读取web.xml的全局参数
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        ApplicationContext context=new ClassPathXmlApplicationContext(contextConfigLocation);
        //将Spring的应用上下文对象存储到ServletVContext域中
        //servletContext.setAttribute("app",bean);
        servletContext.setAttribute("app",context);
        System.out.println("spring容器创建完毕");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
