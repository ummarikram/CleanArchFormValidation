package com.plcoding.cleanarchformvalidation.domain.use_case

import com.plcoding.cleanarchformvalidation.data.repositories.Response

class ValidateTerms {

    fun execute(acceptedTerms: Boolean): Response {
        if(!acceptedTerms) {
            return Response(
                successful = false,
                errorMessage = "Please accept the terms"
            )
        }
        return Response(
            successful = true
        )
    }
}