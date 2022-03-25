package com.dong.filter;

import com.dong.pojo.User;
import com.dong.util.Constants;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class sysFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req1 = (HttpServletRequest) req;
        HttpServletResponse resp1 = (HttpServletResponse) resp;
        //过滤器从session获取用户
        User user = (User) req1.getSession().getAttribute(Constants.smsm_session);
        if (user==null){
            resp1.sendRedirect("/010/error.jsp");
        }
        chain.doFilter(req,resp);
    }

    public void destroy() {

    }
}
