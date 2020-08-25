package com.example.bytar.ui.shop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bytar.R
import com.example.bytar.databinding.ShopBinding
import com.example.bytar.ui.shop.viewmodel.ShopViewModel

class ShopRecyclerAdapter(private val context: Context, private val arrylist:ArrayList<ShopViewModel>):
    RecyclerView.Adapter<ShopRecyclerAdapter.CustomView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomView {

        val layoutInflater = LayoutInflater.from(parent.context)

        val categoryBinding: ShopBinding= DataBindingUtil.inflate(layoutInflater, R.layout.list_item_shop_recycler,parent,false)

        return CustomView(categoryBinding)

    }

    override fun getItemCount(): Int {


            return arrylist.size
    }

    override fun onBindViewHolder(holder: CustomView, position: Int) {
        val categoryViewModel = arrylist[position]
        holder.bind(categoryViewModel)
    }
    class CustomView(val shopBinding: ShopBinding):RecyclerView.ViewHolder(shopBinding.root)
    {
        fun bind (shopViewModel : ShopViewModel)
        {
            this.shopBinding.shopmodel = shopViewModel
            shopBinding.executePendingBindings()
        }
    }
}
