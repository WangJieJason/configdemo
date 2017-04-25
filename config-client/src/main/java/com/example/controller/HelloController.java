package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jason on 2017/4/25.
 */
@RefreshScope
@RestController
public class HelloController {

    @Value("${from}")
    private String from;

    @RequestMapping(value = "/from",method = RequestMethod.GET)
    public String from(){
        return this.from;
    }

}
