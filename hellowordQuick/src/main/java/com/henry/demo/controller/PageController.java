package com.henry.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Henry
 * @date 2019/12/18
 */

@Controller
@ResponseBody
@RequestMapping("/html")
public class PageController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}