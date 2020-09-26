package com.example.bytar.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding
    private val viewModel: LoginViewModel by lazy {
        ViewModelProviders.of(this).get(LoginViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentLoginBinding.inflate(inflater, container, false)

        binding.viewmodel = viewModel
        binding.setLifecycleOwner(this)


        binding.signAsBaytary.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerAsDoctorFragment)
        }

        binding.signAsDealer.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpAsTraderFragment)
        }
        binding.signAsVisitor.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpAsVistorFragment)
        }
        binding.loginBtn.setOnClickListener {
            viewModel.Login()
        }
        return binding.root
    }
}