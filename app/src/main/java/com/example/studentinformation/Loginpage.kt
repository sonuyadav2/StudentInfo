package com.example.studentinformation

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Loginpage : AppCompatActivity() {
    lateinit var etUsername: EditText
    lateinit var etPassword: EditText
    lateinit var btLogin: Button
    lateinit var btForgot: Button
    lateinit var btRegister: Button
    val username = "123"
    val passWord = "123"
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title = "Log In"
        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btLogin = findViewById(R.id.btLogin)
        btForgot = findViewById(R.id.btForgot)
        btRegister = findViewById(R.id.btRegister)
        sharedPreferences =
            getSharedPreferences(getString(R.string.preference), Context.MODE_PRIVATE)
        var check = sharedPreferences.getBoolean("student", false)
//setContentView(R.layout.activity_login)
        if (check) {
            var intent = Intent(this@Loginpage, HomePage::class.java)
            startActivity(intent)
            finish()
        }
        btLogin.setOnClickListener {
            var user = etUsername.text.toString()
            var pass = etPassword.text.toString()
            if ((user == username) && (pass == passWord)) {
                var intent = Intent(this@Loginpage, HomePage::class.java)
                sharedPreferences.edit().putBoolean("student", true).apply()
                startActivity(intent)
            } else {
                Toast.makeText(
                    this@Loginpage,
                    "Username Or Passwird is Incorrect",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        btForgot.setOnClickListener {
            var intent = Intent(this@Loginpage, ForgotPassword::class.java)
            startActivity(intent)
        }
        btRegister.setOnClickListener {
            var intent = Intent(this@Loginpage, Register::class.java)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}