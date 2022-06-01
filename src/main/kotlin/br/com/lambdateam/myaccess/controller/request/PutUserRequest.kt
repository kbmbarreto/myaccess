package br.com.lambdateam.myaccess.controller.request

import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PutUserRequest (

    @field:NotEmpty(message = "Nome deve ser informado")
    var username: String,

    @field:Email(message = "O e-mail informado precisa ser válido")
    var email: String,

    @field:NotEmpty(message = "A senha deve ser informada")
    var password: String
)
