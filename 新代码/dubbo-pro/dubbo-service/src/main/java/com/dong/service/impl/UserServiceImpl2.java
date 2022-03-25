package com.dong.service.impl;

import com.dong.pojo.User;
import com.dong.service.UserService;
import org.apache.dubbo.config.annotation.Service;

//@Service //将该类的对象创建出来放到sprin的ioc容器中 bean的定义
@Service(version = "v2.0") //当前服务超时3秒，重试2次
//dubbo的注解：将这个类提供的方法（服务）对外发布。将访问的地址 ip,端口，路径注册到注册中心中
/**
 * timeout=3000:意思是当前服务3秒超时,不设置时，默认是1秒
 * retries:不设置的化默认是2次
 */
public class UserServiceImpl2 implements UserService {
    int i=1;
    public String sayHello() {
        return "hello hello dubbo!~";
    }

    public User finUserbyid(int id) {
        System.out.println("new ");
        //查询User对象
        User user=new User(1,"zhangsan","123");
        //数据库查询很慢，查了5秒
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return user;
    }
}
