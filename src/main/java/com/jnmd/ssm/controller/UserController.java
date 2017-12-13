package com.jnmd.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jnmd.ssm.domain.User;
import com.jnmd.ssm.service.UserService;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("listUser")
    public ModelAndView listUser(){
        List<User> users=userService.listUser();
        ModelAndView mv=new ModelAndView();
        mv.addObject("users",users);
        mv.setViewName("user");
        return mv;
    }
    
    @RequestMapping("/{uid}/getUser")
    public ModelAndView getUser(@PathVariable("uid")int uid){
        System.out.println(uid);
        User user=userService.getUser(uid);
        ModelAndView mv=new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("userdetails");
        return mv;
    }
    
    @RequestMapping("saveUser")
    public ModelAndView getUser(){
        User user=new User("666","147258",23);
        int flag=userService.saveUser(user);
        ModelAndView mv=new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("saveuser");
        return mv;
    }
}
