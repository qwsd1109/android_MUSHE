package com.example.mushe.contract

interface  SignUpContract {
    interface View {
        fun errorPw(text:String)
        fun errorId(text:String)
        fun errorEmail(text:String)
        fun errorPwCk(text:String)
    }

    interface Presenter {

    }
}