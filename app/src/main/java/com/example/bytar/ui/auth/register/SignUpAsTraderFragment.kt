package com.example.bytar.ui.auth.register

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentSignUpAsTraderBinding

class SignUpAsTraderFragment : Fragment() {

    lateinit var binding: FragmentSignUpAsTraderBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSignUpAsTraderBinding.inflate(inflater, container, false)
        val first = getString(R.string.licence_frist)
        val next = "<font color='#e5b045'>${getString(R.string.conditions)}</font>"
        val last = getString(R.string.licencetext)
        binding.licenceText.setText(Html.fromHtml(first+ " " + next + " " +  last))


        binding.registerAsTraderBtn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpAsTraderFragment_to_signUpSuccessFragment)
        }
        return binding.root
    }
}