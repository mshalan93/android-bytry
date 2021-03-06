package com.example.bytar.ui.homefragment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.example.bytar.R
import com.example.bytar.databinding.FragmentHomeBinding
import com.example.bytar.ui.homefragment.adapter.HomeRecyclerAdapter
import com.example.bytar.ui.homefragment.viewmodel.CategoryViewModel
import java.util.*
import com.example.bytar.ui.homefragment.adapter.SlidingAdapter
import com.example.bytar.ui.homefragment.model.SlidingModel
import com.example.bytar.ui.setting.SettingActivity


class HomeFragment : Fragment() {

    var mPager: ViewPager?=null
    var currentPage=0
    var NUM_PAGES=0
    private var imageModelArrayList: ArrayList<SlidingModel> ?= null

    val myImageList=
            intArrayOf(R.drawable.lion, R.drawable.lion, R.drawable.lion)

    var customadapter: HomeRecyclerAdapter? = null
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomeBinding.inflate(inflater, container, false)

        var categoryViewModel: CategoryViewModel=
        ViewModelProvider.NewInstanceFactory().create(CategoryViewModel::class.java)

        categoryViewModel.getArrayList().observe(requireActivity(), Observer { categoryViewModels ->


            customadapter=HomeRecyclerAdapter(requireContext(), categoryViewModels!!)
            binding.homeRecyclerview.layoutManager = LinearLayoutManager(activity,
                LinearLayoutManager.HORIZONTAL,false)
            binding.homeRecyclerview.setAdapter(customadapter)

        })


        imageModelArrayList = ArrayList()
        imageModelArrayList = populateList()
        init()

        binding.storesContainer.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_storesBytaryFragment)
        }
        binding.doctorContainer.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_doctorsActivity)
        }
        binding.supermarketContainer.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_hyperMarketActivity)
        }


        return binding.root
    }
    open fun init() {
        mPager = binding.pager
        mPager!!.adapter=SlidingAdapter(
            requireContext(),
            imageModelArrayList
        )
        NUM_PAGES=imageModelArrayList!!.size

        // Auto start of viewpager
        val handler=Handler()
        val Update=Runnable {
            if (currentPage == NUM_PAGES) {
                currentPage=0
            }
            mPager!!.setCurrentItem(currentPage++, false)
        }
        val swipeTimer=Timer()
        swipeTimer.schedule(object : TimerTask() {
            override fun run() {
                handler.post(Update)
            }
        }, 5000, 5000)
    }
    private fun populateList(): ArrayList<SlidingModel>? {
        val list: ArrayList<SlidingModel> = java.util.ArrayList<SlidingModel>()
        for (i in 0..2) {
            val imageModel =SlidingModel()
            imageModel.image_drawable=myImageList[i]
            list.add(imageModel)
        }
        return list
    }
}