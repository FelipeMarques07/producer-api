package br.com.felipe.producerApi.model

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import org.springframework.boot.autoconfigure.domain.EntityScan

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityScan
class Address {

    var cep: String? = ""
    var logradouro: String? = ""
    var complemento: String? = ""
    var bairro: String? = ""
    var localidade: String? = ""
    var uf: String? = ""
    var unidade: String? = ""
    var ibge: String? = ""
    var gia: String? = ""
}