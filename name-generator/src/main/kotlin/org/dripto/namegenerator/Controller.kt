package org.dripto.namegenerator

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@RestController
class Controller(private val restTemplate: RestTemplate){
    @GetMapping("/name/random")
    fun random(): FullName = FullName(
        name = sequenceOf(
            restTemplate.getForObject<FirstName>("http://localhost:9091/firstname/random").firstname,
            restTemplate.getForObject<LastName>("http://localhost:9092/lastname/random").lastname
        )
            .joinToString(separator = " ") { it.lowercase().replaceFirstChar(Char::uppercase) }
    )
}