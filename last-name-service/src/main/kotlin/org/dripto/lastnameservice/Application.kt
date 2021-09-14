package org.dripto.lastnameservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LastNameServiceApplication

fun main(args: Array<String>) {
    runApplication<LastNameServiceApplication>(*args)
}
