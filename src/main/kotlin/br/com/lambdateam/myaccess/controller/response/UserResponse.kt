package br.com.lambdateam.myaccess.controller.response

data class UserResponse (

    var idUser: Long? = null,
    var username: String,
    var email: String,
    var password: String
)