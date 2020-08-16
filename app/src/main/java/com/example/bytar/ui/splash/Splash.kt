package com.example.bytar.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.bytar.R
import com.example.bytar.ui.PreLoginActivity
import com.example.bytar.ui.auth.SignupActivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val durations = 3000
        Handler(Looper.myLooper()!!).postDelayed({
            val nextActivity = Intent(this@Splash,  PreLoginActivity::class.java)
            this@Splash.startActivity(nextActivity)
            finish()
        }, durations.toLong())
    }
}