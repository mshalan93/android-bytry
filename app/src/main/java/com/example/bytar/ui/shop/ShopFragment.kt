package com.example.bytar.ui.shop

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.viewpager.widget.ViewPager
import com.example.bytar.R
import com.example.bytar.databinding.FragmentShopBinding
import com.example.bytar.ui.shop.adapter.ShopRecyclerAdapter
import com.example.bytar.ui.shop.adapter.SlidingAdapter
import com.example.bytar.ui.shop.model.SlidingModel
import com.example.bytar.ui.shop.viewmodel.ShopViewModel
import java.util.*

class ShopFragment : Fragment() {
    var mPager: ViewPager?=null
    var currentPage=0
    var NUM_PAGES=0
    private var imageModelArrayList: ArrayList<SlidingModel> ?= null

    val myImageList=
            intArrayOf(R.drawable.lion, R.drawable.lion, R.drawable.lion)

    var customadapter: ShopRecyclerAdapter? = null

    lateinit var binding: FragmentShopBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShopBinding.inflate(inflater, container, false)
        var shopViewModel: ShopViewModel=
                ViewModelProvider.NewInstanceFactory().create(ShopViewModel::class.java)

        shopViewModel.getArrayList().observe(requireActivity(), androidx.lifecycle.Observer {
            customadapter=ShopRecyclerAdapter(requireContext(), it!!)
            binding.shopRecyclerview.setLayoutManager(
                GridLayoutManager(
                    requireContext(),
                    3,
                    GridLayoutManager.VERTICAL,
                    false
                )
            )
            binding.shopRecyclerview.setAdapter(customadapter)

        })

        imageModelArrayList = ArrayList()
        imageModelArrayList = populateList()
      //  init()



        return binding.root
    }

/*
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
*/
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
