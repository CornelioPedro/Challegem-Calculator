package com.example.Calculadora.consumerrs;

import com.example.Calculadora.Controller.divisor;
import com.example.Calculadora.DTO.Division;
import com.example.Calculadora.DTO.Sum;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class DivConsumerrs {
    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload Division divDto){
        divisor div = new divisor();
        BeanUtils.copyProperties(divDto, div);
        System.out.println("Status: " + divDto.getStatus().toString());
    }
}
