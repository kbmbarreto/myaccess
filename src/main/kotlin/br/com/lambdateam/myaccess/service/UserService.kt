package br.com.lambdateam.myaccess.service

import br.com.lambdateam.myaccess.model.User

class UserService {

    fun auth(username: User, password: User) {}

    fun saveUser(username: User, password: User) {}

    fun userValidation(username: User): User { return username}
}