package com.kailaisi.dubbo.service.impl;

import com.kailaisi.dubbo.service.TestService;
import org.apache.dubbo.config.annotation.Service;

//此处的@Service是dubbo提供的，不是spring中的
@Service(version = "${application.version}", timeout = 10000, interfaceClass = TestService.class)
public class TestServiceImpl implements TestService {
    @Override
    public String getString(String src) {
        return src;
    }
}