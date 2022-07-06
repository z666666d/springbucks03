package com.geektime.springdemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "zookeeper-server")
public interface FeignService {

    @RequestMapping("/test")
    String test();
}
