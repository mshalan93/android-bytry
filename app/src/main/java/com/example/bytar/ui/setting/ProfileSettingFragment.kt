package com.example.bytar.ui.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bytar.R
import com.example.bytar.databinding.FragmentProfileSettingBinding


class ProfileSettingFragment : Fragment() {

    lateinit var binding: FragmentProfileSettingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentProfileSettingBinding.inflate(inflater, container, false)

        binding.orderTxtView.setOnClickListener {
            findNavController().navigate(R.id.action_profileSettingFragment_to_orderFragment)
        }
        return binding.root
    }
}