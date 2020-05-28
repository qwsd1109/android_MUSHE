package com.example.mushe.presenter

import android.util.Log
import com.example.mushe.contract.SignInContract

class SignInPresenter (private val view:SignInContract.View): SignInContract.Presenter{

    fun checkCount(pw : String, id : String){
        when {
            id != null -> {
                if(1<pw.length && pw.length <20){
                    //서버연동
                }else if(pw.length == null){
                    view.checkLetterCount("비밀번호를 입력해주시길 바랍니다.")
                    return
                }
            }
            else -> {
                view.errorMessage("아이디를 입력해주십시오")
                return
            }
        }
    }
}