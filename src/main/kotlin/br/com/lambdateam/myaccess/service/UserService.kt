package br.com.lambdateam.myaccess.service

import br.com.lambdateam.myaccess.model.User

open class UserService {

    fun authUser(username: User, password: User) {}

    fun saveUser(username: User, password: User) {}

    fun userValidation(username: User): User { return username}
}