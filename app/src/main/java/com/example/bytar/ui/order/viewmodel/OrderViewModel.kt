package com.example.bytar.ui.order.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bytar.ui.order.model.OrderRecyclerModel

class OrderViewModel : ViewModel {
    var id = ""
    var title = ""
    var desc = ""
    var imagepath = ""

    constructor() : super()
    constructor(category: OrderRecyclerModel) : super() {
        this.id = category.id
        this.title = category.title
        this.desc = category.desc
        this.imagepath = category.imagepath
    }


    var shopArraylistmutablelivedata = MutableLiveData<ArrayList<OrderViewModel>>()

    var arraylist = ArrayList<OrderViewModel>()


    fun getImageUrl(): String {
        return imagepath
    }


    fun getArrayList(): MutableLiveData<ArrayList<OrderViewModel>> {

        val category1 = OrderRecyclerModel("1", "Josue Durand", "primero", "image1.png")
        val category2 = OrderRecyclerModel("2", "Josue Durand", "segundo", "image1.png")
        val category3 = OrderRecyclerModel("3", "Josue Durand", "segundo", "image1.png")

        val categoryviewmodel1: OrderViewModel = OrderViewModel(category1)
        val categoryviewmodel2: OrderViewModel = OrderViewModel(category2)
        val categoryviewmodel3: OrderViewModel = OrderViewModel(category3)

        arraylist!!.add(categoryviewmodel1)
        arraylist!!.add(categoryviewmodel2)
        arraylist!!.add(categoryviewmodel3)
        shopArraylistmutablelivedata.value = arraylist

        return shopArraylistmutablelivedata
    }


}


object ImageBindingAdapter {

/*
    @JvmStatic
    @BindingAdapter("android:src")

    fun setImageUrl(view: ImageView, url: String) {

        Picasso.with(view.context).load(url).placeholder(R.drawable.lion).into(view)

    }*/

}