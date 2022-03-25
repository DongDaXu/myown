package com.kuang.listen;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

public class WebApplication {
    public static ApplicationContext getWebAppication(ServletContext servletContext){
    return (ApplicationContext) servletContext.getAttribute("app");
    }
}
