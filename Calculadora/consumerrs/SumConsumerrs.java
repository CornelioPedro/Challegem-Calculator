package com.example.Calculadora.consumerrs;

import com.example.Calculadora.Controller.sum;
import com.example.Calculadora.DTO.Sum;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class SumConsumerrs {

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload Sum sumDto){
        sum sum = new sum();
        BeanUtils.copyProperties(sumDto, sum);
        System.out.println("Status: " + sumDto.getStatus().toString());
    }

}
