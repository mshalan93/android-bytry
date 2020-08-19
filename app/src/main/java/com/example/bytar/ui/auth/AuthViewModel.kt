package com.example.bytar.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.bytar.data.repositories.UserRepository


class AuthViewModel : ViewModel() {

    var email : String? = null
    var password : String? = null

    var fristName : String? = null
    var secondName : String? = null
    var phone : Int? = null

    var iauthListner : IAuthListner ?=null
    fun onLoginBtnClicked(view: View){
        iauthListner?.onStarted()
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            iauthListner?.onFail("Invalid email or password")
            return
        }

        //sucess

        val loginResponse = UserRepository().userLogin(email!!,password!!)
        iauthListner?.onSuccess(loginResponse)

    }
    fun onSignupBtnClicked(view: View){
        iauthListner?.onStarted()
        if(fristName.isNullOrEmpty() || secondName.isNullOrEmpty() ||phone.toString().isNullOrEmpty()){
            iauthListner?.onFail("Invalid frist name or phone")
            return
        }
        //sucess

        val signResponse = UserRepository().userSignUp(fristName!!,secondName!!,phone!!)
        iauthListner?.onSuccess(signResponse)

    }
}