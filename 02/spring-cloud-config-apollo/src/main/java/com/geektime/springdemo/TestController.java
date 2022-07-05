package com.geektime.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置测试
 * 注意：配置更新后需要发布才能生效
 */
@RestController
public class TestController {

    @Value("${testkey}")
    private String testkey;

    @RequestMapping("/test")
    public String test(){
        return testkey;
    }
}
