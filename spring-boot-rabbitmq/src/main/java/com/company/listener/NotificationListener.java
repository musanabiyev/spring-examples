package com.company.listener;

import com.company.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "test-queue")
    public void handleMessage(Notification notification){
        System.out.println("Message received..");
        System.out.println(notification.toString());
    }
}
