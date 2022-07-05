package com.geektime.springdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringdemoApplication.class)
public class SpringdemoApplicationTests {

    @Autowired
    private MsgProvider msgProvider;

    @Test
    public void test(){
        msgProvider.sendMsg();
    }
}
