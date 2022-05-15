package br.com.lambdateam.myaccess.repository;

import br.com.lambdateam.myaccess.model.UserModel
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserModel, Long> {

    fun findByUsername(username: UserModel)

    fun existsByUsername(username: UserModel): BooleanArray {
        return booleanArrayOf()
    }
}