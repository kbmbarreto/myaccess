package br.com.lambdateam.myaccess.service

import br.com.lambdateam.myaccess.model.UserModel
import br.com.lambdateam.myaccess.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (
    val userRepository: UserRepository
        ) {

    fun getAll(username: String?): List<UserModel> {
        username?.let {
            return userRepository.findByUsernameContaining(it)
        }
        return userRepository.findAll().toList()
    }
}

//    fun authUser(username: UserModel, password: UserModel) {}
//
//    fun saveUser(username: UserModel, password: UserModel) {}
//
//    fun userValidation(username: UserModel): UserModel { return username}