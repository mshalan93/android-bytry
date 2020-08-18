package com.example.bytar.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.bytar.R

import com.example.bytar.ui.PreLoginFragment
import kotlinx.android.synthetic.main.fragment_pre_login.view.*
import kotlinx.android.synthetic.main.pre_login.view.*

class PreLoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        var root : View  = inflater.inflate(R.layout.fragment_pre_login, container, false)


        return root

    }

}