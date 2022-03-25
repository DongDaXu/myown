package com.dong.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        filterChain.doFilter(req,resp);
    }

    public void destroy() {

    }
}
