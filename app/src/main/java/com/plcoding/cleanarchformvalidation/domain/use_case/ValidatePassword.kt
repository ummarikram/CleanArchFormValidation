package com.plcoding.cleanarchformvalidation.domain.use_case

import com.plcoding.cleanarchformvalidation.data.repositories.Response

class ValidatePassword {

    fun execute(password: String): Response {
        if(password.length < 8) {
            return Response(
                successful = false,
                errorMessage = "The password needs to consist of at least 8 characters"
            )
        }
        val containsLettersAndDigits = password.any { it.isDigit() } &&
                password.any { it.isLetter() }
        if(!containsLettersAndDigits) {
            return Response(
                successful = false,
                errorMessage = "The password needs to contain at least one letter and digit"
            )
        }
        return Response(
            successful = true
        )
    }
}