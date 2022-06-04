package br.com.lambdateam.myaccess.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "password")
data class PasswordModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idPassword: Long? = null,
    @Column(name = "description", length = 128)
    var description: String,
    @Column(name = "url", length = 128)
    var url: String,
    @Column(name = "user", length = 64)
    var user: String,
    @Column(name = "password", length = 128)
    var password: String,
    @Column(name = "notes", length = 128)
    var notes: String,
    @ManyToOne
    @JoinColumn(name = "id_user")
    var userId: UserModel? = null

    )
