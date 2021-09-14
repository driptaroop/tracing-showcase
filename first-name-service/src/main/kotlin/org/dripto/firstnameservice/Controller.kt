package org.dripto.firstnameservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstNameController(val firstnameRepo: FirstnameRepo) {
    @GetMapping("/firstname/random")
    fun random(): FirstName = firstnameRepo.findAll().random()
}