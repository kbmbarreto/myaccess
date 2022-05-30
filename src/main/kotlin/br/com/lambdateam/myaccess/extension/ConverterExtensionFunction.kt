package br.com.lambdateam.myaccess.extension

import br.com.lambdateam.myaccess.controller.response.UserResponse
import br.com.lambdateam.myaccess.model.UserModel

fun UserModel.toResponse(): UserResponse {
    return UserResponse(
    idUser = this.idUser,
    username = this.username,
    email = this.email,
    password = this.password
    )
}