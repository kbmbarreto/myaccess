package br.com.lambdateam.myaccess.exception

class NotFoundException(override val message: String, val errorCode: String) : Exception() {
}