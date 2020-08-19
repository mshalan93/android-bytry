package com.example.bytar.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.bytar.R
import com.example.bytar.databinding.ActivitySignupBinding
import com.example.bytar.ui.SuccessActivity
import net.simplifiedcoding.mvvmsampleapp.util.toast


class SignupActivity : AppCompatActivity() ,IAuthListner{
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup)


        binding.submit.setOnClickListener {
            val nextScreenIntent =Intent(this, SuccessActivity::class.java)
            startActivity(nextScreenIntent)
        }
    }

    override fun onStarted(){
        toast("Signup start")
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