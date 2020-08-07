package com.zibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/hello.do")

    public ModelAndView getTest(HttpServletRequest request){
        return new ModelAndView("HelloWorld");
    }
}
