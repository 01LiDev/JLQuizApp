package com.example.jlquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }



        val someDelay = Thread{
            Thread.sleep(3000)
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
                finish()
            }
        someDelay.start()
    }
}