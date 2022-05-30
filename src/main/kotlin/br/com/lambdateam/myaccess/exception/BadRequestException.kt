package br.com.lambdateam.myaccess.exception

class BadRequestException(override val message: String, val errorCode: String) : Exception() {

}
