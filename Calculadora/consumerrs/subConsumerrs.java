package com.example.Calculadora.consumerrs;

import com.example.Calculadora.Controller.multiplication;
import com.example.Calculadora.Controller.subtraction;
import com.example.Calculadora.DTO.Multiplication;
import com.example.Calculadora.DTO.Subtraction;
import lombok.Data;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;

@Data
public class subConsumerrs {
    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload Subtraction subDto){
        subtraction sub = new subtraction();
        BeanUtils.copyProperties(subDto, sub);
        System.out.println("Status: " + subDto.getStatus().toString());
    }
}
