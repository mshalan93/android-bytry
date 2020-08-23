package com.example.bytar.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.bytar.R
import com.example.bytar.databinding.ActivitySuccessBinding
import com.example.bytar.ui.home.MainActivity

class SuccessActivity : AppCompatActivity() {
	private lateinit var binding: ActivitySuccessBinding


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		binding=DataBindingUtil.setContentView(this, R.layout.activity_success)

		binding.Gohome.setOnClickListener {
			val nextScreenIntent=Intent(this, MainActivity::class.java)
			startActivity(nextScreenIntent)
		}
	}
}
