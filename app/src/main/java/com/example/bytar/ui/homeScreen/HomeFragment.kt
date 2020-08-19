package com.example.bytar.ui.homeScreen

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.bytar.R
import com.example.bytar.databinding.FragmentHomeBinding
import com.example.bytar.ui.homeScreen.adapter.CustomAdapter
import com.example.bytar.ui.homeScreen.viewmodel.CategoryViewModel
import com.example.bytar.ui.newslider.MySliderAdapter
import com.example.bytar.ui.newslider.MySliderList
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream
import java.util.*


class HomeFragment : Fragment() {
    private  var NUM_PAGES=3
    private  var currentPage=0

    var mySliderLists: List<MySliderList>?=null
    var adapter: MySliderAdapter?=null
    var indicatorlay: LinearLayout?=null

    var customadapter: CustomAdapter? = null
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomeBinding.inflate(inflater, container, false)

        var categoryViewModel: CategoryViewModel=
        ViewModelProvider.NewInstanceFactory().create(CategoryViewModel::class.java)
        //  ViewModelProviders.of(this).get(CategoryViewModel::class.java)

        categoryViewModel.getArrayList().observe(requireActivity(), Observer { categoryViewModels ->


            customadapter=CustomAdapter(requireContext(), categoryViewModels!!)
            binding.recyclerview!!.setLayoutManager(
                GridLayoutManager(
                    requireContext(),
                    3,
                    GridLayoutManager.VERTICAL,
                    false
                )
            )
            binding.recyclerview.setAdapter(customadapter)


        })


        indicatorlay=binding.layIndicator as LinearLayout

        getdata()
        binding.viewPager.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setupCurrentIndicator(position)
            }
        })
        //NUM_PAGES =onBordingLists.size();
        //NUM_PAGES =onBordingLists.size();
        val handler=Handler()
        val Update=Runnable {
            if (currentPage == NUM_PAGES) {
                currentPage=0
            }
            binding.viewPager.setCurrentItem(currentPage++, true)
        }
        val swipeTimer=Timer()
        swipeTimer.schedule(object : TimerTask() {
            override fun run() {
                handler.post(Update)
            }
        }, 3000, 3000)


        return binding.root
    }
    private fun setupCurrentIndicator(index: Int) {
        val itemcildcount=indicatorlay!!.childCount
        for (i in 0 until itemcildcount) {
            val imageView=
                    indicatorlay!!.getChildAt(i) as ImageView
            if (i == index) {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.indicator_active
                    )
                )
            } else {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.indicator_inactive
                    )
                )
            }

        }
    }

    fun loadJSONFromAsset(): String? {
        var json: String?=null
        json=try {
            val `is`: InputStream = getAssets().open("file.json")
            val size: Int=`is`.available()
            val buffer=ByteArray(size)
            `is`.read(buffer)
            `is`.close()
            String(buffer, "UTF-8")
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
        return json
    }
    private fun getdata() {
        val obj=JSONObject()

        mySliderLists = R.string.slider_response as List<MySliderList>?
        adapter=MySliderAdapter(requireContext(), mySliderLists, binding.viewPager)
        binding.viewPager!!.adapter=adapter
        setupIndicator()
        setupCurrentIndicator(0)

/*
        val call: Unit =MyRetrofit.getInstance().getMyApi().getonbordingdata()
            .enqueue(object : Callback<List<MySliderList?>> {
                override fun onResponse(
                    call: Call<List<MySliderList?>>,
                    response: Response<List<MySliderList?>>
                ) {
                    //mySliderLists=response.body() as List<MySliderList>?
                    mySliderLists = R.string.slider_response as List<MySliderList>?
                    adapter=MySliderAdapter(requireContext(), mySliderLists, binding.viewPager)
                    binding.viewPager!!.adapter=adapter
                    setupIndicator()
                    setupCurrentIndicator(0)
                }

                override fun onFailure(
                    call: Call<List<MySliderList?>>,
                    t: Throwable
                ) {
                }
            })
*/
    }

    private fun setupIndicator() {
        val indicator: Array<ImageView?> = arrayOfNulls(3)
        val layoutParams=LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutParams.setMargins(4, 0, 4, 0)
        indicator.indices.forEach { i ->
            indicator[i]=ImageView(requireContext())
            indicator[i]!!.setImageDrawable(
                ContextCompat.getDrawable(
                    requireContext(),
                    R.drawable.indicator_inactive
                )
            )
            indicator[i]!!.layoutParams=layoutParams
            indicatorlay!!.addView(indicator[i])
        }
    }


}