package br.com.lambdateam.myaccess.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "password")
data class PasswordModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idPassword: Long,
    @Column(name = "description", length = 128)
    val description: String,
    @Column(name = "url", length = 128)
    val url: String,
    @Column(name = "user", length = 64)
    val user: String,
    @Column(name = "password", length = 128)
    val password: String,
    @Column(name = "notes", length = 128)
    val notes: String,
    @ManyToOne
    val iduser: UserModel

    )