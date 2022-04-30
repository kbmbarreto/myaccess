package br.com.lambdateam.myaccess.repository;

import br.com.lambdateam.myaccess.model.User
import lombok.AllArgsConstructor
import lombok.Data
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional
import javax.xml.stream.Location

interface UserRepository : JpaRepository<User, Long> {

    fun onLocationMeasured(location: String)

    fun findByUsername(username: User)

    fun existsByUsername(username: User)
}