package com.henry.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Henry
 * @date 2019/12/10
 */
@ResponseBody
@Controller
public class HelloWorldController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello World quick !";
    }
}
