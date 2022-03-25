package com.dong.controller;


import com.dong.pojo.User;
import com.dong.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/ad")
    public String ad(){
        return "jzxlcjkl";
    }
   // @Autowired//本地注入
    /**
     * @Reference:1.从zookeeper注册中心获取userService的访问url
     *             2.进行远程调用rpc
     *             3.将结果封装为一个代理对象。给变量赋值
     * dubbo2.7.0版本后 就被弃用了，使用@DubboReference
     * cluster:默认是failover
     */
    @Reference(mock = "fail:return null")//相当于不再去调用userservice的服务了
    private UserService userService;
    @RequestMapping("/al")
    public String sayHello(){
       return userService.sayHello();
    }
    //根据id查询用户信息
    int i=1;
    @RequestMapping("/find")
    public User find(int id){
        return userService.finUserbyid(id);
    }
}
