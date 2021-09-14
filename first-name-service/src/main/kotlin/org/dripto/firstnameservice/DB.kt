package org.dripto.firstnameservice

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

interface FirstnameRepo: JpaRepository<FirstName, UUID>

@Entity
@Table(name = "first_names")
class FirstName(
    @Id val id: Int,
    val firstname: String
)