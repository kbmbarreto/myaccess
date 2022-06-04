package br.com.lambdateam.myaccess.service

import br.com.lambdateam.myaccess.enums.Errors
import br.com.lambdateam.myaccess.exception.NotFoundException
import br.com.lambdateam.myaccess.model.PasswordModel
import br.com.lambdateam.myaccess.repository.PasswordRepository
import org.springframework.stereotype.Service

@Service
class PasswordService (
    private val passwordRepository: PasswordRepository
        ) {

    fun getByDescription(description: String?): List<PasswordModel> {
        description?.let {
            return passwordRepository.findByDescriptionContaining(it)
        }
        return passwordRepository.findAll().toList()
    }

    fun create(password: PasswordModel) {
        passwordRepository.save(password)
    }

    fun findById(id: Long): PasswordModel {
        return passwordRepository.findById(id).orElseThrow{ NotFoundException(Errors.SIS201.message.format(id), Errors.SIS201.code) }
    }

    fun update(password: PasswordModel) {
        if(!passwordRepository.existsById(password.idPassword!!)){
            throw Exception()
        }
            passwordRepository.save(password)
    }

    fun delete(idPassword: Long) = passwordRepository.delete(findById(idPassword))

}