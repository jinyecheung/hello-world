package com.akww.hello.world.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("sys")
public class SysController {

    @GetMapping("home")
    public String home(){
        return "sys/home";
    }
    @GetMapping("index")
    public String index(){
        return "sys/index";
    }
    @GetMapping("login")
    public String login(){
        return "sys/login";
    }
    @GetMapping("logout")
    public String logout(){
        return "sys/logout";
    }
}
