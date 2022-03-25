package com.dong.wb;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;


public class BmiPtintServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //接收请求中的参数
        String surname = request.getParameter("name");//姓名
        String w = request.getParameter("w");//身高
        String h = request.getParameter("h");//体重
        //计算bmi bmi=体重/身高的平方
        float height=Float.valueOf(h);
        float weight=Float.valueOf(w);
        float bmi=weight/(height*height);

        //判断bmi的范围
        String msg="";
        if (bmi<18.5){
            msg="您比较瘦";
        }else if (bmi>18.5&&bmi<23.9){
            msg="您的体重室标准的";
        }else if (bmi>24&&bmi<=27){
            msg="你的身体比较胖";
        }else {
         msg="超重";
        }
        System.out.println(msg);
        msg="你好"+surname+"先生/女士,您的bmi是"+bmi+"."+msg;
        //把数据存入到request
        request.setAttribute("msg",msg);
        //使用HttpServletResponse输出数据
        response.setContentType("text/html;charset=utf-8");
        //获取PrintWriter
        PrintWriter writer = response.getWriter();
        //输出数据
        writer.print(msg);
        //清空缓存
        writer.flush();
        writer.close();
    }
}
