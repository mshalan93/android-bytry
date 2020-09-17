package com.example.bytar.ui.order_sent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentOrderSentBinding

class OrderSentFragment : Fragment() {

    lateinit var binding: FragmentOrderSentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentOrderSentBinding.inflate(inflater, container, false)



        binding.backToHome.setOnClickListener {
            findNavController().navigate(R.id.action_orderSentFragment_to_mainActivity2)
        }
        return binding.root


    }
}