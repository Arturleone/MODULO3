package com.example.splashfadein.API

data class LoginResponse(
    val token: String,
    val email: String,
    val dr: String,
    val nome: String,
    val id: Int
)
