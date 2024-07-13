package com.example.triphive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class signup : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var btnSignUp : AppCompatButton
    private lateinit var btnAlreadyHaveAcc: TextView
    private lateinit var usernameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnSignUp = findViewById(R.id.btnSignup)
        btnAlreadyHaveAcc = findViewById(R.id.textviewHaveAccount)
        btnAlreadyHaveAcc.setOnClickListener {
            val intent = Intent(this,SignIn::class.java)
            startActivity(intent)
        }

        auth = Firebase.auth

        usernameEditText = findViewById(R.id.inputUserName)
        emailEditText= findViewById(R.id.inputEmail)
        passwordEditText  = findViewById(R.id.inputPassword)
        confirmPasswordEditText= findViewById(R.id.inputConfirmPassword)

        btnSignUp.setOnClickListener {
            val username = usernameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val confirmPassword = confirmPasswordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty() && username.isNotEmpty()) {
                if (password == confirmPassword) {
                    auth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this) { task ->
                            if (task.isSuccessful) {
                                val intent = Intent(this,SignIn::class.java)
                                startActivity(intent)
                            } else {
                                Log.e("FirebaseError", task.exception?.message ?: "Unknown error occurred")
                                Toast.makeText(baseContext, "Sign up failed. Please check Logcat for details.",
                                    Toast.LENGTH_LONG).show()
                            }
                        }
                } else {
                    Toast.makeText(baseContext, "Passwords do not match.",
                        Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(baseContext, "Please fill all the fields.",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}