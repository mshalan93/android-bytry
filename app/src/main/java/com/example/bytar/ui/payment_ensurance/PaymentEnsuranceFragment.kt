package com.example.bytar.ui.payment_ensurance

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentPaymentEnsuranceBinding

class PaymentEnsuranceFragment : Fragment() {

    lateinit var binding: FragmentPaymentEnsuranceBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentPaymentEnsuranceBinding.inflate(inflater, container, false)


        binding.toPayemntEnusance.setOnClickListener {
            findNavController().navigate(R.id.action_paymentEnsuranceFragment_to_paymentOrderSuccessFragment)
        }
        binding.backToDeliverfee.setOnClickListener {
            findNavController().navigate(R.id.action_paymentEnsuranceFragment_to_deliveryFeeFragment)
        }

        return binding.root


    }
}