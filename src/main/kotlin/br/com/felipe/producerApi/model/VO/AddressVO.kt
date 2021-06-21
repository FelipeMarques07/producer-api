package br.com.felipe.producerApi.model.VO

import com.fasterxml.jackson.annotation.JsonProperty

class AddressVO (

    val cep:String,

    @JsonProperty("logradouro")
    val street:String,

    @JsonProperty("complemento")
    val complement:String,

    @JsonProperty("bairro")
    val district:String,

    @JsonProperty("localidade")
    val location:String,

    @JsonProperty("uf")
    val state:String,

    val ibge:Int,

    val gia:Int,

    val ddd:Int,

    val siafi:Int,
)