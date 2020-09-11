package com.example.bytar.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentLoginBinding.inflate(inflater, container, false)

        binding.signAsBaytary.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerAsDoctorFragment)
        }

        binding.signAsDealer.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpAsTraderFragment)
        }
        binding.signAsVisitor.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpAsVistorFragment)
        }
        return binding.root
    }
}