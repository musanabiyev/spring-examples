package com.company.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String giveMessage(String param){
        System.out.println("The method gave a message param :" + param);
        return param;
    }
}
