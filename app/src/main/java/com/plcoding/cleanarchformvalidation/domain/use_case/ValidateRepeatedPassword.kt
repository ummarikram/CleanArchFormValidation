package com.plcoding.cleanarchformvalidation.domain.use_case

import com.plcoding.cleanarchformvalidation.data.repositories.Response

class ValidateRepeatedPassword {

    fun execute(password: String, repeatedPassword: String): Response {
        if(password != repeatedPassword) {
            return Response(
                successful = false,
                errorMessage = "The passwords don't match"
            )
        }
        return Response(
            successful = true
        )
    }
}