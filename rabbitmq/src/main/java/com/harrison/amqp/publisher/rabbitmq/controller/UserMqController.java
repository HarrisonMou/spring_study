package com.harrison.amqp.publisher.rabbitmq.controller;

import com.harrison.amqp.publisher.rabbitmq.domain.User;
import com.harrison.amqp.publisher.rabbitmq.service.UserMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserMqController {

    @Autowired
    private UserMqService userMqService;

    @GetMapping(value = "/put")
    public String addUserToMq(){
        User user = new User();
        user.setName(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setAddr("上海");
        user.setBirthday(new Date());
        user.setCreateDate(new Date());
        user.setPhone("15681931230");
        user.setStatus(1);
        userMqService.addUserToRabbitMQ(user);
        return "向mq添加成功";
    }
}
