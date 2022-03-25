package com.dong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
    //第一种方式,服务器要返回一个字符串,直接使用response
    @RequestMapping("/a1")
    public void ajax(String name, HttpServletResponse response) throws IOException {
        if ("admin".equals(name)){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }
}
