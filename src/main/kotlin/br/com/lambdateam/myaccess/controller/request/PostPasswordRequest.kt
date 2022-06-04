package br.com.lambdateam.myaccess.controller.request

import br.com.lambdateam.myaccess.model.UserModel
import com.fasterxml.jackson.annotation.JsonAlias
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Null

data class PostPasswordRequest (

    @field:NotEmpty(message = "A descrição deve ser informada")
    var description: String,

    @field:Null
    var url: String,

    @field:NotNull(message = "O nome de usuário deve ser informado")
    var user: String,

    @field:NotNull(message = "A senha deve ser informada")
    var password: String,

    @field:Null
    var notes: String,

    @JsonAlias("user_id")
    var userId: Long
)