package com.example.test.rest;

import com.example.test.service.EmailService;
import com.example.test.service.MessageService;
import org.springframework.aop.scope.ScopedProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NotificationController {
    private MessageService service;
    private MessageService service2;

    @Autowired
    public NotificationController(@Qualifier("emailService") MessageService service,@Qualifier("emailService")MessageService service2)
    {
        this.service = service;
        this.service2 = service2;
    }
//    @Autowired
//    public void setEmail(EmailService email)
//    {
//        this.email = email;
//    }
    @GetMapping("/check")
    public boolean index()
    {
        return this.service == this.service2;
    }
    @GetMapping("/notification")
    public String noti()
    {
        return this.service.message();
    }
}
