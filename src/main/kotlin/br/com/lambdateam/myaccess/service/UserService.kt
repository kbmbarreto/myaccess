package br.com.lambdateam.myaccess.service

import br.com.lambdateam.myaccess.model.UserModel

open class UserService {

    fun authUser(username: UserModel, password: UserModel) {}

    fun saveUser(username: UserModel, password: UserModel) {}

    fun userValidation(username: UserModel): UserModel { return username}
}