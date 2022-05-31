package br.com.lambdateam.myaccess.controller.request

import javax.validation.constraints.NotEmpty

data class PostUserRequest (

    @field:NotEmpty(message = "Username deve ser informado")
    var username: String,

    @field:NotEmpty(message = "E-mail deve ser informado")
    var email: String,

    @field:NotEmpty(message = "Senha deve ser informada")
    var password: String
)
