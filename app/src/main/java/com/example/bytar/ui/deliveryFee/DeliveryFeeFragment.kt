package com.example.bytar.ui.deliveryFee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentDeleveryFeeBinding

class DeliveryFeeFragment : Fragment() {

    lateinit var binding: FragmentDeleveryFeeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentDeleveryFeeBinding.inflate(inflater, container, false)


        binding.toPayemntEnusance.setOnClickListener {
            findNavController().navigate(R.id.action_deliveryFeeFragment_to_paymentEnsuranceFragment)
        }

        binding.backToShop.setOnClickListener {
            findNavController().navigate(R.id.action_deliveryFeeFragment_to_shopFragment)
        }


        return binding.root


    }
}