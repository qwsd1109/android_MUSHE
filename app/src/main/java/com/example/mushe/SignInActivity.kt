package com.example.mushe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        tv_sign_up.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }
        tv_missing_pw.setOnClickListener {
            Toast.makeText(this,"고객센터에 문의해주시길 바람니다.",Toast.LENGTH_SHORT).show()
        }
    }
}
