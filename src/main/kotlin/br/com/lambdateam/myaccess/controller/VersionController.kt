package br.com.lambdateam.myaccess.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("version")
class VersionController {

    @GetMapping("/api")
    fun versionApi(): String {
        return "Versão de API 1.0: 1 - Cadastro e controle de usuários; 2 - Cadastro e controle de Senhas;"
    }
}