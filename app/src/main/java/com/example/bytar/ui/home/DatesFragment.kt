package com.example.bytar.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bytar.R
import com.example.bytar.databinding.FragmentDatesBinding
class DatesFragment : Fragment() {
    lateinit var binding: FragmentDatesBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDatesBinding.inflate(inflater, container, false)

        return binding.root
    }
}

