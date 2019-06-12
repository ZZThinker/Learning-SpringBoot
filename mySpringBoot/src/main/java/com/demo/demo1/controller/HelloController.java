package com.demo.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qianweijie on 2019/6/12.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    /**
     * 启动application，浏览器输入网址即可访问：http://localhost:8080/hello/sayHello
     * @return
     */
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello,MySpringBoot";
    }

}
