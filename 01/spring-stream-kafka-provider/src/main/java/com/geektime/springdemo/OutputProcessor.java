package com.geektime.springdemo;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface OutputProcessor {

    String OUTPUT_CHANNEL = "msgChannel";

    @Output(OUTPUT_CHANNEL)
    MessageChannel msgChannel();
}
