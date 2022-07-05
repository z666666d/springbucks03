package com.geektime.springdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Slf4j
public class MsgProvider {

    @Autowired
    @Qualifier(OutputChannelProcessor.OUTPUT_CHANNEL)
    private MessageChannel msgChannel;

    public void sendMsg(){
        String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        log.info("当前时间为：{}",now);
        msgChannel.send(MessageBuilder.withPayload(now).build(),3000);
    }


}
