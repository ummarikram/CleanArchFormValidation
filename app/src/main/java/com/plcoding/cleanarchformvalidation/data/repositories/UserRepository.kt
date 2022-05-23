package com.plcoding.cleanarchformvalidation.data.repositories

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth

internal interface UserActions {
    fun registerUser(email: String, password: String):Task<AuthResult>
    fun resetEmail(email: String):Task<Void>
    fun loginUser(email: String, password: String) :Task<AuthResult>
}

class UserRepository() : UserActions {

    private var mAuth: FirebaseAuth = FirebaseAuth.getInstance()

    override fun registerUser(email: String, password: String): Task<AuthResult> {
        return mAuth.createUserWithEmailAndPassword(email,password)
    }

    override fun resetEmail(email: String): Task<Void> {
        return mAuth.sendPasswordResetEmail(email)
    }

    override fun loginUser(email: String, password: String):Task<AuthResult> {
        return mAuth.signInWithEmailAndPassword(email, password)
    }
}