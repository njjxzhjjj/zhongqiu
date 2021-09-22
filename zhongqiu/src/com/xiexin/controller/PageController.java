package com.xiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String index1(){
        System.out.println("true = " + true);
        return "index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/addComponentType")
    public String addComponentType(){
        return "addComponentType";
    }

    @RequestMapping("/ind")
    public String ind(){
        return "ind";
    }


    @RequestMapping("/compoSelectAll")
    public String compoSelectAll(){
        return "compoSelectAll";
    }



    @RequestMapping("/addComputer")
    public String addComputer(){
        return "addComputer";
    }


    @RequestMapping("/updateComputer")
    public String updateComputer(){
        return "updateComputer";
    }

}

