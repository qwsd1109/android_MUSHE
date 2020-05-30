package com.example.mushe.presenter

import com.example.mushe.contract.SignUpContract



class SignUpPresenter(private val view:SignUpContract.View):SignUpContract.Presenter {

    fun ServerCommunication( email :String,id : String,pw : String,pwck : String) {

    }
    fun checkCount(email :String,id : String,pw : String,pwck : String) {
        when {
            id != null -> {

            }
            else -> {
                view.errorId("아이디를 입력해주십시오")
                return
            }
        }
        if (8 < pw.length && pw.length < 30) {
            //서버연동
        } else if (pw.length == null) {
            view.errorPw("비밀번호를 입력해주시길 바랍니다.")
            return
        } else if (pw == pwck) {
            view.errorPwCk("입력한 비밀번호가 일치하지않습니다.")
            return
        } else {
            view.errorPw("비밀번호는 8자 이상 30자 이하로 설정해주십시오")
            return
        }
        if (email.length == null) {
            view.errorEmail("이메일을 입력해주십시오")
            return
        } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            view.errorEmail("이메일 형식대로 입력해주십시오")
            return
        } else {
            ServerCommunication(email, id, pw, pwck)
        }
    }
}