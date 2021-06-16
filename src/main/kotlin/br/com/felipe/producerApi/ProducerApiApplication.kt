package br.com.felipe.producerApi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProducerApiApplication

fun main(args: Array<String>) {
	runApplication<ProducerApiApplication>(*args)
}
