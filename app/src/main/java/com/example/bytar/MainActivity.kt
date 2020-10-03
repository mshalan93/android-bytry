package com.example.bytar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
/*
import com.example.bytar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        lifecycle.addObserver(viewModel)
        viewModel.searchResult_.observe(this, {
            it.forEach {
                binding.tvSearchResult.text = "${binding.tvSearchResult.text} ${it.title}"
            }
        })
        viewModel.executeSearch("san")
    }
}*/
