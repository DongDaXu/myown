package com.it;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1.获取下载文件的路径
        String realPath = "D:\\新代码\\javaweb-02-servlet\\response\\src\\main\\resources\\01.jpg";
        System.out.println("下载的文件路径"+realPath);
//        2.下载的文件名是啥
        String filename = realPath.substring(realPath.lastIndexOf("\\")+1);
//        3.设置想办法让浏览器能够支持(Content-disposition)下载我们需要的东西,使用URLEncoder.encode对文件进行编码，否则会有乱码
        resp.setHeader("Content-disposition","attachment;filename"+ URLEncoder.encode(filename,"utf-8"));
//        4.获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
//        5.创建缓冲区
        int line=0;
        byte[] buffer = new byte[1024];
//        6.获取output stream对象
        ServletOutputStream out = resp.getOutputStream();
//        7.将FileOutputStream流写入到buffer缓冲区
        while ((line=in.read(buffer))!=0){
            out.write(buffer,0,line);
        }
//        8.使用OutputStream将缓冲区中的数据输出到客户端
            in.close();
            out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
