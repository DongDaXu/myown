package com.dong.controller;

import com.dong.pojo.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserControl {
    @RequestMapping(value = "/quick10")
    @ResponseBody
    //期望SpringMvc自动将User转换成json格式的字符串
    public User save10() throws IOException {
        User user=new User();
        user.setUsername("153111");
        user.setAge(15);
        return user;
    }
    @RequestMapping(value = "/quick9")
    @ResponseBody
    public String save9() throws IOException {
        User user=new User();
        user.setUsername("阿达");
        user.setAge(15);
        //使用json转换工具将对象转换为json格式字符的对象
        ObjectMapper objectMapper=new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }
    @RequestMapping(value = "/quick8")
    @ResponseBody
    public String save8() throws IOException {
        return "{\"username\":\"zhangsan\",\"age\"\":18\"}";
    }
    @RequestMapping(value = "/quick7")
    @ResponseBody//告知SpringMvc框架不进行视图跳转直接进行数据响应(重点)
    public String save7() throws IOException {
        return "hello world";
    }
    @RequestMapping(value = "/quick6")
    public void save6(HttpServletResponse resp) throws IOException {
        resp.getWriter().write("hello world");
    }
    @RequestMapping(value = "/quick5")
    public String save5(HttpServletRequest req){
        req.setAttribute("username","夸大就");
        return "success";
    }
    @RequestMapping(value = "/quick4")
    public String save4(Model model){
        model.addAttribute("username","剥削u古");
        return "success";
    }
    @RequestMapping(value = "/quick3")
    public ModelAndView save3(ModelAndView modelAndView){//SpringMvc会自动注入
        modelAndView.addObject("username","ica000");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping(value = "/quick2")
    public ModelAndView save2(){
        /*
        Model:模型 作用封装模型
        View:视图 作用展示数据
         */
        ModelAndView view = new ModelAndView();
        view.addObject("username","itcast");
        view.setViewName("/success");
        return view;
    }
    @RequestMapping(value = "/quick",method = RequestMethod.GET)
    public String save(){
        System.out.println("方法执行了");
        return "success";
    }
}
