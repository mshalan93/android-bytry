package com.example.bytar.ui.order

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
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.fragment.findNavController
import com.example.bytar.R

class OrderFragment : Fragment() {
    lateinit var binding: FragmentOrderBinding

    var customadapter: OrderRecyclerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderBinding.inflate(inflater, container, false)



         binding.continues.setOnClickListener {
             findNavController().navigate(R.id.action_orderFragment_to_orderDetailsFragment)
         }


        var searchViewModel=
                ViewModelProvider.NewInstanceFactory().create(OrderViewModel::class.java)

        searchViewModel.getArrayList().observe(requireActivity(), Observer {
            customadapter=OrderRecyclerAdapter(requireContext(), it!!)
            binding.orderRecyclerView.layoutManager= LinearLayoutManager(activity)

            val swipeToDeleteCallback = object : SwipeToDeleteCallback() {
                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                    val pos = viewHolder.adapterPosition
                    it.removeAt(pos)
                    binding.orderRecyclerView.adapter?.notifyItemRemoved(pos)
                }
            }

            val itemTouchHelper = ItemTouchHelper(swipeToDeleteCallback)
            itemTouchHelper.attachToRecyclerView(binding.orderRecyclerView)

            binding.orderRecyclerView.adapter=customadapter

        })




        return binding.root
    }

}