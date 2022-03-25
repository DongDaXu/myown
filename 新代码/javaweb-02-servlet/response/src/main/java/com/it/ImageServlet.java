package com.it;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //如何让浏览器5秒自动刷新一次
        resp.setHeader("refresh","3");
        //在内存中创建图片
        BufferedImage bu = new BufferedImage(80,30,BufferedImage.TYPE_INT_RGB);
        //得到图片
        Graphics2D g =(Graphics2D) bu.getGraphics();
        //设置图片的背景颜色
        g.setColor(Color.CYAN);
        g.fillRect(0,0,80,30);
        //给图片写数据
        g.setColor(Color.BLACK);
        g.setFont(new Font(null,Font.BOLD,20));
        g.drawString(makeR(),0,20);
        //告诉浏览器这个请求用图片的方式打开
        resp.setContentType("image/jpeg");
        //网站存在缓存，不让浏览器缓存
        resp.setDateHeader("expires",-1);
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");
        //把图片写给浏览器
        ImageIO.write(bu,"jpg",resp.getOutputStream());
    }
    //生成随机出
    private String makeR(){
        Random ran = new Random();
        String num=ran.nextInt(99999999)+" ";
        StringBuffer stb = new StringBuffer();
        for (int i = 0; i < 7-num.length(); i++) {
            stb.append("0");
        }
         num=stb.toString()+num;
        return num;
    }
}
