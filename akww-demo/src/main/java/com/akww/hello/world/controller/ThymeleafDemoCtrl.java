package com.akww.hello.world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafDemoCtrl {

    @RequestMapping("test")
    public String test(Model model){
        model.addAttribute("akakTest","姼鸠纷呀吖");
        return "thymeleafdemo/testdemo";
    }
}
