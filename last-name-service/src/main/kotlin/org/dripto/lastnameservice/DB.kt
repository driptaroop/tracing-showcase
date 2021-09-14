package org.dripto.lastnameservice

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

interface LastnameRepo: JpaRepository<LastName, UUID>

@Entity
@Table(name = "last_names")
class LastName(
    @Id val id: Int,
    val lastname: String
)