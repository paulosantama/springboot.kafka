package com.example.kafka.demo.kafka.listeners

import com.example.kafka.demo.domain.Greeting
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class AtualizacaoSetorListener {

    @KafkaListener(topics = 'test.spring.kafka')
    void listenAtualizacao(String message) {
        println "Received Message in group: $message"
    }

    @KafkaListener(topics = 'test.spring.kafka.greeting', containerFactory = 'greetingKafkaListenerContainerFactory')
    void listenAtualizacao2(Greeting greeting) {
        println "Received Message in group: $greeting.name $greeting.msg"
    }

}
