package it.cast;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=GBK");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        resp.setCharacterEncoding("GBK");
        req.setCharacterEncoding("GBK");
        Boolean flag=true;
        //服务器从客户端获取cookie
        Cookie[] cookies = req.getCookies();//说明cookie有多个
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals("name")){
                resp.getWriter().write(String.valueOf(cookies[i]));
                flag=false;
                break;
            }
        }
        if (flag){
            resp.getWriter().write("首次访问");
            Cookie cookie = new Cookie("name", System.currentTimeMillis()+"");
            resp.addCookie(cookie);
        }
        //判断cookie是否为空
//        if (cookies.length!=0||cookies!=null){
//            writer.print("您上一次访问的时间是");
//            for (int i = 0; i < cookies.length; i++) {
//                Cookie cookie = cookies[i];
//                System.out.println(cookie);
//                if (cookie.getName().equals("name")){
//                    long l = Long.parseLong(cookie.getValue());
//                    Date date = new Date(l);
//                    writer.print(date.toLocaleString());
//                }
//            }
//        }else {
//            writer.print("这是您第一次访问本站");
//        }
        //服务器给客户端相应一个对象
    }

}
