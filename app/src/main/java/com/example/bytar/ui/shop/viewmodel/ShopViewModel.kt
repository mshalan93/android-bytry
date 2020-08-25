package com.example.bytar.ui.shop.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bytar.ui.shop.model.ShopRecyclerModel

class ShopViewModel : ViewModel {
    var id = ""
    var title = ""
    var desc = ""
    var imagepath = ""

    constructor() : super()
    constructor(category: ShopRecyclerModel) : super() {
        this.id = category.id
        this.title = category.title
        this.desc = category.desc
        this.imagepath = category.imagepath
    }


    var shopArraylistmutablelivedata = MutableLiveData<ArrayList<ShopViewModel>>()

    var arraylist = ArrayList<ShopViewModel>()


    fun getImageUrl(): String {
        return imagepath
    }


    fun getArrayList(): MutableLiveData<ArrayList<ShopViewModel>> {

        val category1 = ShopRecyclerModel("1", "Josue Durand", "primero", "image1.png")
        val category2 = ShopRecyclerModel("2", "Josue Durand", "segundo", "image1.png")
        val category3 = ShopRecyclerModel("3", "Josue Durand", "segundo", "image1.png")

        val categoryviewmodel1: ShopViewModel = ShopViewModel(category1)
        val categoryviewmodel2: ShopViewModel = ShopViewModel(category2)
        val categoryviewmodel3: ShopViewModel = ShopViewModel(category3)

        arraylist!!.add(categoryviewmodel1)
        arraylist!!.add(categoryviewmodel2)
        arraylist!!.add(categoryviewmodel3)
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