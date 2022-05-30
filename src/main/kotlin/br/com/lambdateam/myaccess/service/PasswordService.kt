package br.com.lambdateam.myaccess.service

import br.com.lambdateam.myaccess.enums.Errors
import br.com.lambdateam.myaccess.exception.NotFoundException
import br.com.lambdateam.myaccess.model.PasswordModel
import br.com.lambdateam.myaccess.repository.PasswordRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class PasswordService(
    private val passwordRepository: PasswordRepository
) {

    fun create(password: PasswordModel) {
        passwordRepository.save(password)
    }

    fun findAll(pageable: Pageable): Page<PasswordModel> {
        return passwordRepository.findAll(pageable)
    }

    fun findById(id: Long): PasswordModel {
        return passwordRepository.findById(id).orElseThrow{ NotFoundException(Errors.SIS101.message.format(id), Errors.SIS101.code) }
    }



    fun update(password: PasswordModel) {
        passwordRepository.save(password)
    }

    fun findAllByIds(passwordIds: Set<Long>): List<PasswordModel> {
        return passwordRepository.findAllById(passwordIds).toList()
    }
}