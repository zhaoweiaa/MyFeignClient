package cn.jxau.zw.service;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceFailure implements HelloService{
    @Override
    public String sayHello() {
        System.out.println("HelloApplication service was not avaliable");
        return "HelloApplication service was not avaliable";
    }
}
