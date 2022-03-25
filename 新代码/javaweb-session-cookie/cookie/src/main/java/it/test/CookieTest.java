package it.test;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CookieTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("GBK");
        req.setCharacterEncoding("GBK");
        resp.setContentType("text/html;charset=GBK");
        Cookie[] cookies = req.getCookies();
        if (cookies.length>0 || cookies!=null){
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if ("lastTime".equals(cookie.getName())){
                    Date date = new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                    String format = sdf.format(date);
                    cookie.setValue(format);
                    resp.addCookie(cookie);
                    String value = cookie.getValue();
                    resp.getWriter().write("欢迎回来，您上次访问的时间是"+value);
                }
            }
        }else {
            Date date = new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String format = sdf.format(date);
            Cookie lastTime = new Cookie("lastTime", format);
            resp.addCookie(lastTime);
            lastTime.setMaxAge(24*60*60);
            resp.getWriter().write("这是您首次访问");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
