package com.example.bytar.ui.order.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bytar.R
import com.example.bytar.ui.order.viewmodel.OrderViewModel
import com.example.bytar.databinding.OrderBinding

class OrderRecyclerAdapter(private val context: Context, private val arrylist:ArrayList<OrderViewModel>):
    RecyclerView.Adapter<OrderRecyclerAdapter.CustomView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomView {

        val layoutInflater = LayoutInflater.from(parent.context)

        val orderBinding: OrderBinding= DataBindingUtil.inflate(layoutInflater, R.layout.list_item_order_recycler,parent,false)

        return CustomView(orderBinding)

    }

    override fun getItemCount(): Int {


        return arrylist.size
    }

    override fun onBindViewHolder(holder: CustomView, position: Int) {
        val orderViewModel = arrylist[position]
        holder.bind(orderViewModel)
    }
    class CustomView(val orderBinding: OrderBinding):RecyclerView.ViewHolder(orderBinding.root)
    {
        fun bind (orderViewModel : OrderViewModel)
        {
            this.orderBinding.ordermodel = orderViewModel
            orderBinding.executePendingBindings()
        }
    }
}
