package br.com.felipe.producerApi.controllers

import br.com.felipe.producerApi.model.Address
import br.com.felipe.producerApi.services.AddressService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/address")
class AddressController {

    @Autowired
    lateinit var addressService: AddressService

    @PostMapping
    fun create(@RequestBody address: Address): ResponseEntity<Any>{
        addressService.addressByCep(address.cep.toString())
        return ResponseEntity.ok().build();
    }

}