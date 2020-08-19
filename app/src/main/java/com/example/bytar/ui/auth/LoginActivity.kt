package com.example.bytar.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.bytar.R

import com.example.bytar.databinding.ActivityLoginBinding
import com.example.bytar.ui.home.MainActivity
import net.simplifiedcoding.mvvmsampleapp.util.toast

class LoginActivity : AppCompatActivity() ,IAuthListner{
    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = DataBindingUtil.setContentView(this , R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.iauthListner = this


        binding.buttonSignIn.setOnClickListener {
            val nextScreenIntent =Intent(this, MainActivity::class.java)
            startActivity(nextScreenIntent)
        }
    }

    override fun onStarted(){
        toast("login start")
        //      progress_bar.show()
    }

    override fun onSuccess(loginResponse: LiveData<String>) {
        loginResponse.observe(this, Observer {
    //        progress_bar.hide()
            toast(it)

        })
    }

    override fun onFail(message: String) {
      //  progress_bar.hide()
        toast(message)

    }
}