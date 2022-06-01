package br.com.lambdateam.myaccess.controller

import br.com.lambdateam.myaccess.controller.request.PostUserRequest
import br.com.lambdateam.myaccess.controller.response.UserResponse
import br.com.lambdateam.myaccess.extension.toResponse
import br.com.lambdateam.myaccess.extension.toUserModel
import br.com.lambdateam.myaccess.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getByUsername(@RequestParam username: String?): List<UserResponse> {
        return userService.getByUsername(username).map { it.toResponse() }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid user: PostUserRequest) {
        userService.create(user.toUserModel())
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable idUser: Long): UserResponse {
        return userService.findById(idUser).toResponse()
    }

}