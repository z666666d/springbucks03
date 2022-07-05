package com.geektime.springdemo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InputProcessor {
    String INPUT_CHANNEL = "msgChannel";

    @Input(INPUT_CHANNEL)
    SubscribableChannel msgChannel();
}
