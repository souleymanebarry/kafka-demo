package com.barry.kafka.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = {"amigoscode"} , groupId = "groupId")

    public void onMessage(String message){
        System.out.println("consume receive ===>: "+message);
    }


}
