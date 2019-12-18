package com.henry.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import face.FaceDetect;
/**
 * @author Henry
 * @date 2019/12/10
 */
@ResponseBody
@Controller
public class HelloWorldController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello World quick !  <img src=\"images/demo.jpg\">";
    }
    @GetMapping("/login")
    public String login() {
        return "<!DOCTYPE html>\n" +
                "<html xmlns:th=\"http://www.thymeleaf.org\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>登陆</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<form name=\"\" action=\"/yaoyao/user\" method=\"post\">\n" +
                "    <table align=\"center\">\n" +
                "        <tr>\n" +
                "            <td>\n" +
                "                用户名<input type=\"text\" name=\"name\" />\n" +
                "            </td>\n" +
                "            <td>\n" +
                "                密码<input type=\"password\" name=\"password\"/>\n" +
                "            </td>\n" +
                "\n" +
                "            <td>\n" +
                "                <input type=\"submit\" name=\"tijiao\" value=\"登录\"/>\n" +
                "            </td>\n" +
                "\n" +
                "        </tr>\n" +
                "\n" +
                "    </table>\n" +
                "\n" +
                "</form>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }


    @RequestMapping("detect")
    public String detect() {
        return FaceDetect.dett();
    }

}
