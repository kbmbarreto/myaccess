package br.com.lambdateam.myaccess.enums

enum class Errors(val code: String, val message: String) {

    SIS000("SIS-000", "Access Denied"),
    SIS001("SIS-001", "Invalid Request"),
    SIS101("SIS-101", "Password [%s] not exists"),
    SIS102("SIS-102", "Cannot update password with status [%s]"),
    SIS201("SIS-201", "User [%s] not exists")
}