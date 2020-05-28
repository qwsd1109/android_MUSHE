package com.example.mushe.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mushe.R
import com.example.mushe.contract.SignUpContract
import com.example.mushe.presenter.SignUpPresenter
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity(), View.OnClickListener,SignUpContract.View {

    private lateinit var presenter : SignUpPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        presenter = SignUpPresenter(this)
        initViewListener()
    }
    private fun initViewListener(){
        tv_sign_in.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.tv_sign_in){
            startActivity(Intent(this,SignInActivity::class.java))
        }
    }
}
