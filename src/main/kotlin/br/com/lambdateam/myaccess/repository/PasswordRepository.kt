package br.com.lambdateam.myaccess.repository;

import br.com.lambdateam.myaccess.model.PasswordModel
import org.springframework.data.jpa.repository.JpaRepository

interface PasswordRepository : JpaRepository<PasswordModel, Long> {

    fun findByPassword(password: PasswordModel): List<PasswordModel>
}