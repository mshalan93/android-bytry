package com.example.bytar.ui.stores.storetabs

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentStoresBinding

class StoresFragment : Fragment() {

    lateinit var binding: FragmentStoresBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentStoresBinding.inflate(inflater, container, false)

        binding.addAdsBtn.setOnClickListener {

            findNavController().navigate(R.id.action_storesBytaryFragment_to_addAdsFragment2)
        }
        return binding.root
    }
}