package br.com.felipe.producerApi.controllers

import br.com.felipe.producerApi.config.OrderQueueSender
import br.com.felipe.producerApi.model.Address
import br.com.felipe.producerApi.services.AddressService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/address")
class AddressController {
    private val log = LoggerFactory.getLogger(javaClass)

    @Autowired
    lateinit var orderQueueSender : OrderQueueSender

    @Autowired
    lateinit var addressService: AddressService

    @PostMapping
    fun create(@RequestBody address: Address): HttpEntity<Any?> {
        var addressTmp = addressService.addressByCep(address)
        orderQueueSender.send(addressTmp);
        return ResponseEntity.ok().build();
    }

}