package com.example.bytar.ui.search.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bytar.ui.search.model.SearchRecyclerModel

class SearchViewModel : ViewModel {
    var id = ""
    var title = ""
    var desc = ""
    var imagepath = ""

    constructor() : super()
    constructor(category: SearchRecyclerModel) : super() {
        this.id = category.id
        this.title = category.title
        this.desc = category.desc
        this.imagepath = category.imagepath
    }


    var shopArraylistmutablelivedata = MutableLiveData<ArrayList<SearchViewModel>>()

    var arraylist = ArrayList<SearchViewModel>()


    fun getImageUrl(): String {
        return imagepath
    }


    fun getArrayList(): MutableLiveData<ArrayList<SearchViewModel>> {

        val category1 = SearchRecyclerModel("1", "Josue Durand", "primero", "image1.png")
        val category2 = SearchRecyclerModel("2", "Josue Durand", "segundo", "image1.png")
        val category3 = SearchRecyclerModel("3", "Josue Durand", "segundo", "image1.png")

        val categoryviewmodel1: SearchViewModel = SearchViewModel(category1)
        val categoryviewmodel2: SearchViewModel = SearchViewModel(category2)
        val categoryviewmodel3: SearchViewModel = SearchViewModel(category3)

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