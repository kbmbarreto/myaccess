package br.com.lambdateam.myaccess.controller.response

import br.com.lambdateam.myaccess.model.UserModel

data class PasswordResponse(

    var idPassword: Long? = null,
    var description: String,
    var url: String,
    var user: String,
    var password: String,
    var idUser: Long,
    val userId: UserModel?
)