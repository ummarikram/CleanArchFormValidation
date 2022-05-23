package com.plcoding.cleanarchformvalidation.domain.use_case

import android.view.View
import android.widget.Toast
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.plcoding.cleanarchformvalidation.data.repositories.UserRepository


class RegisterUser {

    private lateinit var user: UserRepository

    fun registerWithEmail(email: String, password: String): Task<AuthResult> {

        user = UserRepository()

        return user.registerUser(email,password)
    }
}