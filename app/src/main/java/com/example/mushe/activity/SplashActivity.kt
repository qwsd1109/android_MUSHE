package com.example.mushe.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.mushe.R

class SplashActivity : AppCompatActivity() {

    val SPlASH_TIME_OUT : Long = 1500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(Intent(this,
                ExplanationActivity::class.java))
            finish()
        },SPlASH_TIME_OUT)
    }
}
