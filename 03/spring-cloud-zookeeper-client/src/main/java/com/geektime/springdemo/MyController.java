package com.geektime.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/test")
    public String test(){
        return feignService.test();
    }

}
