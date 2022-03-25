package com.dong.log;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testt {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        DiyLog log = context.getBean("log", DiyLog.class);
        log.save();
    }
}
