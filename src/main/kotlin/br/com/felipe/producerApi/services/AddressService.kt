package br.com.felipe.producerApi.services

import br.com.felipe.producerApi.model.Address
import br.com.felipe.producerApi.viaCep.ViaCep
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AddressService {

    @Autowired
    lateinit var viaCep: ViaCep

    fun addressByCep (address: Address): String{
        var addressTmp = viaCep.findAddressByCep(address.cep.toString());
        return addressTmp;
    }
}