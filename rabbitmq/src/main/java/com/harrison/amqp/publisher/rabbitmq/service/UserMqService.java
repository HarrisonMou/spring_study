package com.harrison.amqp.publisher.rabbitmq.service;

import com.harrison.amqp.publisher.rabbitmq.domain.User;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMqService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public Boolean addUserToRabbitMQ(User user){
        try {
            rabbitTemplate.convertAndSend("harrison.user.direct.user", user);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
