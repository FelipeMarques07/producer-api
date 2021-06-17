package br.com.felipe.producerApi.config


import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class OrderQueueSender {
    @Autowired
    lateinit var rabbitTemplate: RabbitTemplate;

    @Autowired
    lateinit var queue: Queue

    fun send(order : String){

        if(order != "{\n" +
                "  \"erro\": true\n" +
                "}"){
            rabbitTemplate.convertAndSend("OrderQueue", order);
        }else{

            rabbitTemplate.convertAndSend("FailOrderQueue", order);
        }
    }
}