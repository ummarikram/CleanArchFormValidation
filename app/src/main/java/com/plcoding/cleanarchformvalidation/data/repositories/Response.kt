package com.plcoding.cleanarchformvalidation.data.repositories

data class Response(
    val successful: Boolean,
    val errorMessage: String? = null
)
