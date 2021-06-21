package br.com.felipe.producerApi.controllers

import br.com.felipe.producerApi.config.OrderQueueSender
import br.com.felipe.producerApi.model.Address
import br.com.felipe.producerApi.services.AddressService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/address")
class AddressController {

    private val log = LoggerFactory.getLogger(javaClass)

    @Autowired
    private lateinit var addressService: AddressService

    @PostMapping
    fun send(@RequestBody address: Address): ResponseEntity<Any?> {
       addressService.addressByCep(address)

        //orderQueueSender.send(addressTmp)
        return ResponseEntity.ok().build();
    }

}