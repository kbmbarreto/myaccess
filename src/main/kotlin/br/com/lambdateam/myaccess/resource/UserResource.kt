package br.com.lambdateam.myaccess.resource

import br.com.lambdateam.myaccess.repository.UserRepository
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
@RequestMapping("/api/v1/users", produces = [MediaType.APPLICATION_JSON_VALUE])
class UserResource ( val userRepository: UserRepository ) {

}