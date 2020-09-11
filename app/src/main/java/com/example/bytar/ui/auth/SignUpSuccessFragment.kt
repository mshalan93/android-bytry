package com.example.bytar.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentSignUpSuccessBinding

class SignUpSuccessFragment : Fragment() {

    lateinit var binding: FragmentSignUpSuccessBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSignUpSuccessBinding.inflate(inflater, container, false)


        binding.sucessed.setOnClickListener {
            findNavController().navigate(R.id.action_signUpSuccessFragment_to_mainActivity)
        }

        return binding.root


    }
}