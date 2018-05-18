package com.lee.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lee.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jack
 * @since 2018/5/18
 */
@Controller
@RequestMapping("")
public class HelloConsumer {
    @Reference(url = "dubbo://127.0.0.1:20880")
    private HelloService helloService;

    @RequestMapping("/")
    @ResponseBody
    public String sayHello(String name){
        return helloService.sayHello(name);
    }
}