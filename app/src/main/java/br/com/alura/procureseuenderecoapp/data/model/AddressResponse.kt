package br.com.alura.procureseuenderecoapp.data.model

data class AddressResponse(
    val cep : String? = null,
    val logradouro: String? = null,
    val complemento: String? = null,
    val bairro : String? = null,
    val localidade: String? = null,
    val uf: String? = null,
    val ibge: String? = null,
    val gia: String? = null,
    val ddd: String? = null,
    val siafi: String? = null

)
