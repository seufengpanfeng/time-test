package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 冯攀峰(fengpanfeng @ corp.netease.com)
 */
@Controller
public class LoginController {
    @RequestMapping("login")
    @ResponseBody
    public String login(){
        return "hello";
    }
}
