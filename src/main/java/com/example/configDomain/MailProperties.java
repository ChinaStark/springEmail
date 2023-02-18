package com.example.configDomain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.mail")
public class MailProperties {
    @Value("${spring.mail.password}")
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }
}
