package br.com.lambdateam.myaccess.repository;

import br.com.lambdateam.myaccess.model.UserModel
import org.apache.catalina.realm.X509UsernameRetriever
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserModel, Long> {

    fun findByUsernameContaining(username: String): List<UserModel>
}