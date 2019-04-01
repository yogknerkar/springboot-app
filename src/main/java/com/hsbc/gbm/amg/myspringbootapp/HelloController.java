package com.hsbc.gbm.amg.myspringbootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello()
    {
       return"Welcome to HSBC!!!";
    }
}
