package com.example.bytar.ui.order

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bytar.databinding.FragmentOrderBinding
import com.example.bytar.ui.order.adapter.OrderRecyclerAdapter
import com.example.bytar.ui.order.viewmodel.OrderViewModel

class OrderFragment : Fragment() {
    lateinit var binding: FragmentOrderBinding

    var customadapter: OrderRecyclerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderBinding.inflate(inflater, container, false)


        var searchViewModel=
                ViewModelProvider.NewInstanceFactory().create(OrderViewModel::class.java)

        searchViewModel.getArrayList().observe(requireActivity(), Observer {
            customadapter=OrderRecyclerAdapter(requireContext(), it!!)
            binding.orderRecyclerView?.layoutManager= LinearLayoutManager(activity)
            binding.orderRecyclerView?.setAdapter(customadapter)

        })



        return binding.root
    }

}