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

    override fun onCreate(savedInstanceState: Bundle ?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        presenter = SignUpPresenter(this)
        initViewListener()
    }
    private fun initViewListener(){
        tv_sign_in.setOnClickListener(this)
        Signinbutton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.tv_sign_in){
            startActivity(Intent(this,SignInActivity::class.java))
        }else if(v?.id ==R.id.Signinbutton){
            presenter.checkCount(
                signup_edit_email.getText().toString(),
                signup_edit_id.getText().toString(),
                signup_edit_password.getText().toString(),
                signup_edit_password_ck.getText().toString()
            )
        }
    }

    override fun errorPw(text: String) {
        signup_edit_password.setError(text)
    }

    override fun errorId(text: String) {
        signup_edit_id.setError(text)
    }

    override fun errorEmail(text: String) {
        signup_edit_email.setError(text)
    }

    override fun errorPwCk(text: String) {
        signup_edit_password_ck.setError(text)
    }

}
