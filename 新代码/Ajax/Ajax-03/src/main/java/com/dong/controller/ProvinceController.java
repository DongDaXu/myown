package com.dong.controller;

import com.dong.pojo.Province;
import com.dong.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/province")
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;
    @RequestMapping("/province01")
    @ResponseBody
    public ModelAndView pro01(String name){
        System.out.println("方法执行了");
        ModelAndView modelAndView = new ModelAndView();
        int i = Integer.parseInt(name);
        Province querprovince = provinceService.querprovince(i);
        modelAndView.addObject("pro",querprovince);
        modelAndView.setViewName("Ajax");
        return modelAndView;
    }
}
