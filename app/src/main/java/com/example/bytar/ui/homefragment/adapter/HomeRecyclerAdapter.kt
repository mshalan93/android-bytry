package com.example.bytar.ui.homefragment.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bytar.R
import com.example.bytar.databinding.CategoryBinding
import com.example.bytar.ui.homefragment.viewmodel.CategoryViewModel

class HomeRecyclerAdapter(private val context: Context, private val arrylist:ArrayList<CategoryViewModel>):
    RecyclerView.Adapter<HomeRecyclerAdapter.CustomView>()

{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomView {

        val layoutInflater = LayoutInflater.from(parent.context)

        val categoryBinding: CategoryBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item_home_recycler,parent,false)

        return CustomView(categoryBinding)

    }

    override fun getItemCount(): Int {


        return arrylist.size
    }

    override fun onBindViewHolder(holder: CustomView, position: Int) {
        val categoryViewModel = arrylist[position]
        holder.bind(categoryViewModel)
    }
    class CustomView(val categoryBinding: CategoryBinding):RecyclerView.ViewHolder(categoryBinding.root)
    {
        fun bind (categoryViewModel : CategoryViewModel)
        {
            this.categoryBinding.categorymodel = categoryViewModel
            categoryBinding.executePendingBindings()
        }
    }
}
