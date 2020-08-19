package com.example.bytar.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil

import com.example.bytar.R
import com.example.bytar.ui.auth.LoginActivity
import com.example.bytar.databinding.ActivityPreLoginBinding
import com.example.bytar.ui.auth.SignupActivity

class PreLoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_pre_login)

        binding.btnLogin.setOnClickListener {
                val nextScreenIntent =Intent(this, LoginActivity::class.java)
                startActivity(nextScreenIntent)
            }
        binding.buttonSignUp.setOnClickListener {
            val nextScreenIntent =Intent(this, SignupActivity::class.java)
            startActivity(nextScreenIntent)
        }

    }
}