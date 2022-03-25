package com.dong.controller;

import com.dong.pojo.User;
import com.dong.pojo.Vo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class UserControl {
    @RequestMapping(value = "/json5")//在springmvc中配置了json用来解决乱码问题
    @ResponseBody
    public String json5() throws JsonProcessingException {
       //如何让他不返回时间戳!我们要关闭它的时间戳
        //时间格式化问题 自定义日期格式对象
        ObjectMapper mapper=new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //让mapper指定日期格式为simpleDateFormat
        mapper.setDateFormat(simpleDateFormat);
        //写一个日期对象
        Date date=new Date();

        return mapper.writeValueAsString(date);
    }
    @RequestMapping(value = "/json4")//在springmvc中配置了json用来解决乱码问题
    @ResponseBody
    public String json4() throws JsonProcessingException {
        Date date=new Date();
        //发现问题：事件默认返回的json字符串编程时间戳格式:1645597644603
        return new ObjectMapper().writeValueAsString(date);
    }
    @RequestMapping(value = "/json3")//在springmvc中配置了json用来解决乱码问题
    @ResponseBody
    public String json3() throws JsonProcessingException {
       ObjectMapper mapper=new ObjectMapper();
       List<User> userList=new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            userList.add(new User("老白",i));
        }
        String s = mapper.writeValueAsString(userList);
        return s;
    }
    @RequestMapping(value = "/json2",produces = "application/json;charset=utf-8")//设置produces后会解决乱码问题
    @ResponseBody
    public String json2() throws JsonProcessingException {
        //需要一个json的对象映射器,就是一个类，可以将对象转换为json字符串
        ObjectMapper mapper =new ObjectMapper();
        //创建一个对象
        User user=new User("1号",188);
        System.out.println(user);
        //将java对象转换为json字符串
        String s = mapper.writeValueAsString(user);
        System.out.println(s);
        return s;//由于使用了@ResponseBody注解，这里会将str转换为json格式的字符串返回，十分方便
    }
    //produces:指定响应体返回类型和编码
    @RequestMapping(value = "/json")
    @ResponseBody
    public String json1() throws JsonProcessingException {
        //需要一个json的对象映射器,就是一个类，可以将对象转换为json字符串
        ObjectMapper mapper =new ObjectMapper();
        //创建一个对象
        User user=new User("1号",188);
        System.out.println(user);
        //将java对象转换为json字符串
        String s = mapper.writeValueAsString(user);
        System.out.println(s);
        return s;//由于使用了@ResponseBody注解，这里会将str转换为json格式的字符串返回，十分方便,在运行时有汉字会出现乱码
    }
    @RequestMapping(value = "/quick",method = RequestMethod.GET)
    public String save(){
        System.out.println("方法执行了");
        return "success";
    }
}
