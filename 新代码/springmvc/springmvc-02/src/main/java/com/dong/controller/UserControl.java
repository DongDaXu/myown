package com.dong.controller;

import com.dong.pojo.User;
import com.dong.pojo.Vo;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class UserControl {
    @ResponseBody
    @RequestMapping("/quick25")
    public User getall(){
        User user = new User();
        user.setUsername("Ajax发送");
        user.setAge(100);
        return user;
    }
    @RequestMapping(value = "/quick24")
    @ResponseBody
    public void save24() throws IOException {

    }
    @RequestMapping(value = "/quick23")
    @ResponseBody
    public void save23(String username, MultipartFile[] uploadfile) throws IOException {
        System.out.println(username);
        //获得文件名称
        for (MultipartFile multipartFile : uploadfile) {
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("C:\\Users\\董晓轩\\Documents\\自定义 Office 模板\\"+originalFilename));
        }
    }
    @RequestMapping(value = "/quick22")
    @ResponseBody
    public void save22(String username, MultipartFile uploadfile) throws IOException {
        System.out.println(username);
        //获得文件名称
        String originalFilename = uploadfile.getOriginalFilename();
        uploadfile.transferTo(new File("C:\\Users\\董晓轩\\Documents\\自定义 Office 模板\\"+originalFilename));
    }
    @RequestMapping(value = "/quick21")
    @ResponseBody
    public void save21(@CookieValue("JSESSIONID") String jsession) {
        System.out.println(jsession);
    }
    @RequestMapping(value = "/quick20")
    @ResponseBody
    public void save20(@RequestHeader("User-Agent") String user_agent) {
        System.out.println(user_agent);
    }
    @RequestMapping(value = "/quick19")
    @ResponseBody
    public void save19(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }
    @RequestMapping(value = "/quick18")
    @ResponseBody
    public void save18(Date date) {
        System.out.println(date);
    }
    @RequestMapping(value = "/quick17/{username}")
    @ResponseBody
    public void save17(@PathVariable(value = "username") String username){
        System.out.println(username);
    }
    @RequestMapping(value = "/quick16")
    @ResponseBody
    public void save16(@RequestParam(value = "name",required = false,defaultValue = "itac") String username){
        System.out.println(username);
    }
    @RequestMapping(value = "/quick15")
    @ResponseBody
    public void save15(@RequestBody List<User> userList){
        System.out.println(userList);
    }
    @RequestMapping(value = "/quick14")
    @ResponseBody
    public void save14(Vo vo) throws IOException {
        System.out.println(vo);
    }
    @RequestMapping(value = "/quick13")
    @ResponseBody
    public void save13(String[] strs) throws IOException {
        System.out.println(Arrays.asList(strs));
    }
    @RequestMapping(value = "/quick12")
    @ResponseBody
    public void save12(User user) throws IOException {
        System.out.println(user);;
    }
    @RequestMapping(value = "/quick11")
    @ResponseBody
    public void save11(String username,int age) throws IOException {
        System.out.println(username);
        System.out.println(age);
    }
    @RequestMapping(value = "/quick10")
    @ResponseBody//代表不进行页面跳转
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
