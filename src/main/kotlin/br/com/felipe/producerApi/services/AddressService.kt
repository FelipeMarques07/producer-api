package br.com.felipe.producerApi.services

import br.com.felipe.producerApi.config.OrderQueueSender
import br.com.felipe.producerApi.model.Address
import br.com.felipe.producerApi.model.VO.AddressVO
import br.com.felipe.producerApi.viaCep.ViaCep
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AddressService {

    @Autowired
    private lateinit var viaCep: ViaCep

    @Autowired
    private lateinit var orderQueueSender : OrderQueueSender

    fun addressByCep (address: Address): AddressVO? {
        var address = address.cep?.let { viaCep.findAddressByCep(it)}
        orderQueueSender.send()
    }

}