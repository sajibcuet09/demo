package com.example.demo.messagequeue;


import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.time.LocalDateTime;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Receiver {
    private CountDownLatch latch;


    @Autowired
    public Receiver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void receiveMessage(String message) {
        if("1".equalsIgnoreCase(message)){
            try {
                TimeUnit.SECONDS.sleep(10);
            }catch (Exception ex){
                ex.printStackTrace();
            }
            System.out.println(LocalDateTime.now()+" message: "+message);
        }else {
            System.out.println(LocalDateTime.now()+" message"+message);
        }
        latch.countDown();
    }
}
