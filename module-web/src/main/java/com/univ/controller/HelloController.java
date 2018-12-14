package com.univ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.univ.B;

/**
 * @author univ
 * @datetime 2018/12/3 6:57 PM
 * @description 实验性质的controller
 */

@Controller
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("/first")
    @ResponseBody
    public String first() {
        System.out.println("hello, world");
        B b = new B();
        System.out.println(b.getName());
        return "{\"name\":\"univ\", \"age\":28}";
    }
}
