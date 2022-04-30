package br.com.lambdateam.myaccess.repository;

import br.com.lambdateam.myaccess.model.Password
import org.springframework.data.jpa.repository.JpaRepository

interface PasswordRepository : JpaRepository<Password, Long> {
}