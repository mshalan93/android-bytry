package com.example.bytar.ui.auth.register.registerasvistor

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentSignUpAsVistorBinding

class SignUpAsVistorFragment : Fragment() {
    lateinit var binding: FragmentSignUpAsVistorBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSignUpAsVistorBinding.inflate(inflater, container, false)
        val first = getString(R.string.licence_frist)
        val next = "<font color='#e5b045'>${getString(R.string.conditions)}</font>"
        val last = getString(R.string.licencetext)
        binding.licenceTextVisitor.setText(Html.fromHtml(first+ " " + next + " " +  last))

        binding.registerAsVistorBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpAsVistorFragment_to_signUpSuccessFragment)
        }
        return binding.root
    }
}