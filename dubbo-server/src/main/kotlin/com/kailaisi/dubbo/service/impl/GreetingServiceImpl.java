package com.kailaisi.dubbo.service.impl;

import com.kailaisi.dubbo.service.GreetingService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;


@Service(version = "${application.version}",timeout = 10000,interfaceClass = GreetingService.class)
public class GreetingServiceImpl implements GreetingService {
    @Value("${dubbo.application.name}")
    private String serviceName;

    public String sayHello(String name) {
        return name;
    }
}