package com.listerner;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//在线上人数监听, 统计网站在线人数：统计session
public class listeneronlin implements HttpSessionListener {
    //创建session监听
    //一旦创建session就会触发这个事件
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer count = (Integer) context.getAttribute("count");
        if (count==null){
            count=new Integer(1);
        }else {
            int i=count.intValue();
            count=new Integer(i+1);
        }
        context.setAttribute("count",count);
    }
    //销毁session监听
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        se.getSession().invalidate();//销毁
        Integer count = (Integer) context.getAttribute("count");
        if (count==null){
            count=new Integer(0);
        }else {
            int i=count.intValue();
            count=new Integer(i+1);
        }
        context.setAttribute("count",count);
    }
}
