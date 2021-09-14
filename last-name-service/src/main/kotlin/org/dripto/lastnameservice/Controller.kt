package org.dripto.lastnameservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LastNameController(val lastnameRepo: LastnameRepo) {
    @GetMapping("/lastname/random")
    fun random(): LastName = lastnameRepo.findAll().random()
}