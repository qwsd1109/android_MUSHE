package com.example.mushe.contract

interface  SignInContract {
    interface View {
        fun errorMessage(text: String)
        fun checkLetterCount(text: String)
    }

    interface Presenter {

    }
}