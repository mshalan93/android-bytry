package com.example.bytar.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bytar.databinding.FragmentSearchBinding
import com.example.bytar.ui.search.adapter.SearchRecyclerAdapter
import com.example.bytar.ui.search.viewmodel.SearchViewModel

class SearchFragment : Fragment() {

    private val searchViewModel: SearchViewModel?=null
    var customadapter: SearchRecyclerAdapter? = null
    lateinit var binding: FragmentSearchBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)

        var searchViewModel=
                ViewModelProvider.NewInstanceFactory().create(SearchViewModel::class.java)

        searchViewModel.getArrayList().observe(requireActivity(), Observer {
            customadapter=SearchRecyclerAdapter(requireContext(), it!!)
            binding.searchRecyclerview.layoutManager = LinearLayoutManager(activity)
            binding.searchRecyclerview.setAdapter(customadapter)

        })


        binding.searchview.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {

                return false
            }
            override fun onQueryTextChange(p0: String?): Boolean {
                //Start filtering the list as user start entering the characters

                return false
            }
        })


        return binding.root

    }
}
