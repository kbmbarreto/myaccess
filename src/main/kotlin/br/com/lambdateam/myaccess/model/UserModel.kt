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
    var idUser: Long? = null,
    @Column(name = "username", length = 60)
    var username: String,
    @Column(name = "email", length = 75)
    var email: String,
    @Column(name = "password", length = 256)
    var password: String

    )