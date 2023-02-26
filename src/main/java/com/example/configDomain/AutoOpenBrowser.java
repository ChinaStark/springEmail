package com.example.configDomain;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.io.IOException;

/**
 * 当我们启动服务器的时候就会自动的打开浏览器
 */
@Configuration
public class AutoOpenBrowser {
    @EventListener({ApplicationReadyEvent.class})
    public void applicationReadyEvent() {
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