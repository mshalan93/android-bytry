package com.example.bytar.ui.search.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bytar.R

import com.example.bytar.databinding.SearchBinding
import com.example.bytar.ui.search.viewmodel.SearchViewModel

class SearchRecyclerAdapter(private val context: Context, private val arrylist:ArrayList<SearchViewModel>):
    RecyclerView.Adapter<SearchRecyclerAdapter.CustomView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomView {

        val layoutInflater = LayoutInflater.from(parent.context)

        val SearchBinding:  SearchBinding= DataBindingUtil.inflate(layoutInflater, R.layout.list_item_search_recycler,parent,false)

        return CustomView(SearchBinding)

    }

    override fun getItemCount(): Int {


        return arrylist.size
    }

    override fun onBindViewHolder(holder: CustomView, position: Int) {
        val searchViewModel = arrylist[position]
        holder.bind(searchViewModel)
    }
    class CustomView(val searchBinding: SearchBinding):RecyclerView.ViewHolder(searchBinding.root)
    {
        fun bind (searchViewModel : SearchViewModel)
        {
            this.searchBinding.searchmodel = searchViewModel
            searchBinding.executePendingBindings()
        }
    }
}
