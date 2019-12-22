package com.kailaisi.dubbo.control;

import com.kailaisi.dubbo.service.GreetingService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteUserController {

    //timeout 可以不指定，但是version一定要指定 不然会找不到服务 直连需要加url="dubbo://localhost:20880"
    @Reference(version = "1.0.0")
    private GreetingService greetingService;


    @RequestMapping(value = "/dubbo/say/{name}")
    public String sayHello(@PathVariable("name") String name) {
        String result = greetingService.sayHello(name);
        return result;
    }


}