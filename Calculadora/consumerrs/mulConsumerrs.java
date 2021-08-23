package com.example.Calculadora.consumerrs;

import com.example.Calculadora.Controller.divisor;
import com.example.Calculadora.Controller.multiplication;
import com.example.Calculadora.DTO.Multiplication;
import com.example.Calculadora.DTO.Sum;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class mulConsumerrs {
    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload Multiplication mulDto){
        multiplication mul = new multiplication();
        BeanUtils.copyProperties(mulDto, mul);
        System.out.println("Status: " + mulDto.getStatus().toString());
    }
}
