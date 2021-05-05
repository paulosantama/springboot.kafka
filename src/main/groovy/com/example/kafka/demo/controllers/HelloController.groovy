package com.example.kafka.demo.controllers

import com.example.kafka.demo.domain.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate

    @Autowired
    private KafkaTemplate<String, Greeting> kafkaTemplateGreeting

    @RequestMapping("/")
    String index() {
        return "Greetings from Spring Boot!"
    }

    @RequestMapping("/send")
    void send() {
        String message = 'Test Spring Kafka String'
        kafkaTemplate.send('test.spring.kafka', '10', message)
    }

    @RequestMapping("/sendGretting")
    void sendGreeting() {
        Greeting greeting = new Greeting('Hello','World')
        kafkaTemplateGreeting.send('test.spring.kafka.greeting', '20', greeting)
    }

}
