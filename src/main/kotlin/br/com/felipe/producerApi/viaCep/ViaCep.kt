package br.com.felipe.producerApi.viaCep

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@FeignClient("addressService", url = "http://viacep.com.br/")
interface ViaCep {

    @GetMapping("/ws/{cep}/json", consumes = ["application/json"])
    @ResponseBody
    fun findAddressByCep(@PathVariable("cep") cep:String): Map<String, Any>

}