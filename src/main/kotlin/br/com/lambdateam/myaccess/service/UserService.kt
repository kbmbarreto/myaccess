package br.com.lambdateam.myaccess.service

import br.com.lambdateam.myaccess.enums.Errors
import br.com.lambdateam.myaccess.exception.NotFoundException
import br.com.lambdateam.myaccess.model.UserModel
import br.com.lambdateam.myaccess.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (
    private val userRepository: UserRepository
        ) {

    fun getByUsername(username: String?): List<UserModel> {
        username?.let {
            return userRepository.findByUsernameContaining(it)
        }
        return userRepository.findAll().toList()
    }

    fun create(user: UserModel) {
        userRepository.save(user)
    }

    fun findById(id: Long): UserModel {
        return userRepository.findById(id).orElseThrow{ NotFoundException(Errors.SIS201.message.format(id), Errors.SIS201.code) }
    }

    fun update(user: UserModel) {
        if(!userRepository.existsById(user.idUser!!)){
            throw NotFoundException(Errors.SIS201.message.format(user.idUser), Errors.SIS201.code)
        }

        userRepository.save(user)
    }

    fun delete(id: Long) {
        val user = findById(id)
        userRepository.save(user)
    }

//    fun emailAvailable(email: String): Boolean {
//        return !userRepository.existsByEmail(email)
//    }
}