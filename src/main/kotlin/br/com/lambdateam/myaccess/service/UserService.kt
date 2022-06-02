package br.com.lambdateam.myaccess.service

import br.com.lambdateam.myaccess.enums.Errors
import br.com.lambdateam.myaccess.exception.NotFoundException
import br.com.lambdateam.myaccess.model.UserModel
import br.com.lambdateam.myaccess.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable

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
            throw Exception()
        }
            userRepository.save(user)
    }

    fun delete(idUser: Long) = userRepository.delete(findById(idUser))

    fun emailAvailable(email: String): Boolean {
        return !userRepository.existsByEmail(email)
    }
}