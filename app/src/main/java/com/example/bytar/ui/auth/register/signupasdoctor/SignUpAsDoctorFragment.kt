package com.example.bytar.ui.auth.register.signupasdoctor

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentSignUpAsDoctorBinding

class SignUpAsDoctorFragment : Fragment() {
    lateinit var binding: FragmentSignUpAsDoctorBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpAsDoctorBinding.inflate(inflater, container, false)

        val first = getString(R.string.licence_frist)
        val next = "<font color='#e5b045'>${getString(R.string.conditions)}</font>"
        val last = getString(R.string.licencetext)
        binding.licenceTextDoctor.setText(Html.fromHtml(first+ " " + next + " " +  last))


        binding.registerAsDoctorBtn.setOnClickListener {
            findNavController().navigate(R.id.action_registerAsDoctorFragment_to_signUpSuccessFragment)
        }
        return binding.root


    }
}