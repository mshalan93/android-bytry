package com.example.bytar.ui.order_payment_success

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentPaymentOrderSuccessBinding

class PaymentOrderSuccessFragment : Fragment() {

    lateinit var binding: FragmentPaymentOrderSuccessBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentPaymentOrderSuccessBinding.inflate(inflater, container, false)


        binding.backToHome.setOnClickListener {
            findNavController().navigate(R.id.action_paymentOrderSuccessFragment_to_homeFragment)
        }

        return binding.root


    }
}