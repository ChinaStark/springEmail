package com.example.configDomain;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.io.IOException;

@Configuration
public class AutoBrower {
    @EventListener({ApplicationReadyEvent.class})
    void applicationReadyEvent() {
        // 这里需要注url:端口号+测试类方法名
        String url = "http://localhost:8080";
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}