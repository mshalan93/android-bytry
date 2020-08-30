package com.example.bytar.ui.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
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

        binding.orderTxtView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                view?.findNavController()?.navigate(R.id.action_profileSettingFragment_to_orderFragment)

            }
        })

        return binding.root
    }
}