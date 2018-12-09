package cn.jxau.zw.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "HelloApplication", fallback = HelloWorldServiceFailure.class)
@Qualifier("helloService")
public interface HelloService {


    @RequestMapping(value = "/",method = RequestMethod.GET)
    String sayHello();
}
