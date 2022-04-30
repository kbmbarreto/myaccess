package br.com.lambdateam.myaccess.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idUser: Long,
    @Column(name = "username", length = 60)
    val username: String,
    @Column(name = "password", length = 128)
    val password: String

    )