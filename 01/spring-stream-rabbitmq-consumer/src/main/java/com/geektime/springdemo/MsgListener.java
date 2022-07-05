package com.geektime.springdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MsgListener {

    @StreamListener(InputChannelProcessor.INPUT_CHANNEL)
    public void msgListener(String msg){
        log.info(msg);
    }

}
