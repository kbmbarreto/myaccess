package br.com.lambdateam.myaccess.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
data class UserModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idUser: Long,
    @Column(name = "username", length = 60)
    val username: String,
    @Column(name = "email", length = 75)
    val email: String,
    @Column(name = "password", length = 256)
    val password: String

    )