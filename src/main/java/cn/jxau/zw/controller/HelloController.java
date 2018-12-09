package cn.jxau.zw.controller;

import cn.jxau.zw.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Qualifier("helloService")
    @Autowired
    HelloService helloService;


    @GetMapping("/hello")
    public String sayHello(){
        return helloService.sayHello();
    }
}
