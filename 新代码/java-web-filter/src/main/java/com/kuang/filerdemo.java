package com.kuang;

import javax.servlet.*;
import java.io.IOException;

public class filerdemo implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("已经初始化");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    servletRequest.setCharacterEncoding("utf-8");
    servletResponse.setCharacterEncoding("utf-8");
    servletResponse.setContentType("text/html;charset=utf-8");
        System.out.println("执行前");
        filterChain.doFilter(servletRequest,servletResponse);//让我们的请求继续走，如果不屑程序到这里就会停止
        System.out.println("执行后");
    }

    public void destroy() {
        System.out.println("已经销毁");
    }
}
