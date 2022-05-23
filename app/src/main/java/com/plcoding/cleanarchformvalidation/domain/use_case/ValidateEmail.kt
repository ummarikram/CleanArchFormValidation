package com.plcoding.cleanarchformvalidation.domain.use_case

import android.util.Patterns
import com.plcoding.cleanarchformvalidation.data.repositories.Response

class ValidateEmail {

    fun execute(email: String): Response {
        if(email.isBlank()) {
            return Response(
                successful = false,
                errorMessage = "The email can't be blank"
            )
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return Response(
                successful = false,
                errorMessage = "That's not a valid email"
            )
        }
        return Response(
            successful = true
        )
    }
}