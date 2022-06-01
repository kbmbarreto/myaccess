package br.com.lambdateam.myaccess.extension

import br.com.lambdateam.myaccess.controller.request.PostUserRequest
import br.com.lambdateam.myaccess.controller.request.PutUserRequest
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

fun PostUserRequest.toUserModel(): UserModel {
    return UserModel(
        username = this.username,
        email = this.email,
        password = this.password
    )
}

fun PutUserRequest.toUserModel(previousValue: UserModel): UserModel {
    return UserModel(
        idUser = previousValue.idUser,
        username = this.username,
        email = this.email,
        password = this.password
    )
}