package com.it;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

public class FileServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path="D:\\新代码\\javaweb-02-servlet\\response\\src\\main\\resources\\01.jpg";
        String filename = path.substring(path.lastIndexOf("\\") + 1);
        System.out.println("要下载的文件名是"+filename);
        resp.setHeader("Content-disposition","attachment;filename"+ URLEncoder.encode(filename,"utf-8"));
        FileInputStream in=new FileInputStream(path);
        ServletOutputStream out= resp.getOutputStream();
        int len=0;
        byte[] bytes = new byte[1024];
        while ((len=in.read(bytes))!=0){
            out.write(bytes,0,len);
        }
        in.close();
        out.close();
    }
}