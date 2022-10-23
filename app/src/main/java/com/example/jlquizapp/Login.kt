package com.example.jlquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Login : AppCompatActivity() {
    private lateinit var bRegister: Button
    private lateinit var bLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        bRegister = findViewById(R.id.button)
        bLogin = findViewById(R.id.button2)
        counter = 0
        bLogin.setOnClickListener{
            val text = "Successfully Login"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
            val intent = Intent(this, Quiz::class.java)
            startActivity(intent)
        }
        bRegister.setOnClickListener{
            val intent = Intent(this, RegAccount::class.java)
            startActivity(intent)
        }
    }
}