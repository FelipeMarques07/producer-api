package br.com.felipe.producerApi.model

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
class Address {

    var cep: String? = ""

}