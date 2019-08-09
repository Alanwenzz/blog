package com.zw.eblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    /**
     * 根跳转
     */
    @GetMapping("/")
    public String root(){
        return "redirect:/index";
    }

    /**
     * 主页跳转
     */
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    /**
     * 登录跳转
     */
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    /**
     * 登录失败跳转
     */
    @PostMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError", true);
        model.addAttribute("errorMsg", "登录失败,用户名或者密码错误");
        return "login";
    }

    /**
     * 注册跳转
     */
    @GetMapping("/register")
    public String register(){
        return "register";
    }


}
