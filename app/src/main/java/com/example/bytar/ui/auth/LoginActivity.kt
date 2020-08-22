package com.example.bytar.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.bytar.R
import com.example.bytar.databinding.ActivityLoginBinding

import com.example.bytar.ui.home.MainActivity

class LoginActivity : AppCompatActivity(){
    private lateinit var binding : ActivityLoginBinding

    private val viewModel: LoginViewModel by lazy {
        ViewModelProviders.of(this).get(LoginViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = DataBindingUtil.setContentView(this , R.layout.activity_login)
        binding.viewmodel = viewModel



        binding.setLifecycleOwner(this)

        binding.buttonSignIn.setOnClickListener {
            val nextScreenIntent =Intent(this, MainActivity::class.java)
            startActivity(nextScreenIntent)
        }
    }

}