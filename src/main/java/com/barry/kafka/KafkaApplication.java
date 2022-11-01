package com.barry.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;

@EnableKafka
@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

    @Bean
    CommandLineRunner start(KafkaTemplate<String, String> kafkaTemplate){
        return  args -> {
            for (int i = 0; i <= 10_000; i++){
                kafkaTemplate.send("amigoscode","hello kafka = "+i);
            }
        };
    }

}
