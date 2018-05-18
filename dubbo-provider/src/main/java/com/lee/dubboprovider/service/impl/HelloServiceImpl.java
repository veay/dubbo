package com.lee.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lee.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author jack
 * @since 2018/5/18
 */
@Service(interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return " hello "+name;
    }
}
