package br.com.lambdateam.myaccess.controller

import br.com.lambdateam.myaccess.controller.response.UserResponse
import br.com.lambdateam.myaccess.extension.toResponse
import br.com.lambdateam.myaccess.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAll(@RequestParam username: String?): List<UserResponse> {
        return userService.getAll(username).map { it.toResponse() }
    }
}