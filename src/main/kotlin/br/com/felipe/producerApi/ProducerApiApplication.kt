package br.com.felipe.producerApi


import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.annotation.Value

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean

@EnableFeignClients
@SpringBootApplication
class ProducerApiApplication {


	var orderQueue: String = "";

	@Bean
	fun queue(): Queue {

		return Queue(orderQueue, true);
	}
}

	fun main(args: Array<String>) {
		runApplication<ProducerApiApplication>(*args)
	}


