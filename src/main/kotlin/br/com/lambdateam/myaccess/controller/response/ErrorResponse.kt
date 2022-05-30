package br.com.lambdateam.myaccess.controller.response

data class ErrorResponse (
    var httpCode: Int,
    var message: String,
    var internalCode: String,
    val errors: List<FieldErrorResponse>?
)