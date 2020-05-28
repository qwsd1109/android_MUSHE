package com.example.mushe.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.mushe.R
import com.example.mushe.contract.SignInContract
import com.example.mushe.presenter.SignInPresenter
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity(), View.OnClickListener,SignInContract.View {

    private lateinit var presenter : SignInPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        presenter = SignInPresenter(this)
        initViewListener()
    }
    private fun initViewListener(){
        Signinbutton.setOnClickListener (this)
        tv_sign_up.setOnClickListener(this)
        tv_missing_pw.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.Signinbutton){
            presenter.checkCount(
                signin_edit_password.getText().toString(),
                signin_edit_id.getText().toString()
            )
        }
        else if(v?.id == R.id.tv_sign_up){
            startActivity(Intent(this, SignUpActivity::class.java))
        }else if(v?.id == R.id.tv_missing_pw){
            Toast.makeText(this,"고객센터에 문의해주시길 바람니다.",Toast.LENGTH_SHORT).show()
        }
    }
    override fun errorMessage(text: String) {
        signin_edit_id.setError(text)
    }

    override fun checkLetterCount(text: String) {
        signin_edit_password.setError(text)
    }

}
