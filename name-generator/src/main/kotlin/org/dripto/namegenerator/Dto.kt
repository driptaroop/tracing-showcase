package org.dripto.namegenerator

data class FirstName(
    val id: Int,
    val firstname: String
)
data class LastName(
    val id: Int,
    val lastname: String
)

data class FullName(
    val name: String
)