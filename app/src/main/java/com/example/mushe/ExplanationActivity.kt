package com.example.mushe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explanation.*

class ExplanationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explanation)

        btn_signup.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }

        btn_signin.setOnClickListener {
            startActivity(Intent(this,SignInActivity::class.java))
        }
    }
}
