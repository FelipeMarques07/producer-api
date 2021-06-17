package br.com.felipe.producerApi

import br.com.felipe.producerApi.controllers.AddressController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class ProducerApiApplication

fun main(args: Array<String>) {
	runApplication<ProducerApiApplication>(*args)


}
