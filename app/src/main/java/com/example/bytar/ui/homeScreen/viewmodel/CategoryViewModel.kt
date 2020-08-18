package com.example.bytar.ui.homeScreen.viewmodel

import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bytar.R
import com.example.bytar.ui.homeScreen.model.Category
import com.squareup.picasso.Picasso

class CategoryViewModel : ViewModel {
    var id = ""
    var title = ""
    var desc = ""
    var imagepath = ""

    constructor() : super()
    constructor(category: Category) : super() {
        this.id = category.id
        this.title = category.title
        this.desc = category.desc
        this.imagepath = category.imagepath
    }


    var arraylistmutablelivedata = MutableLiveData<ArrayList<CategoryViewModel>>()

    var arraylist = ArrayList<CategoryViewModel>()


    fun getImageUrl(): String {
        return imagepath
    }


    fun getArrayList(): MutableLiveData<ArrayList<CategoryViewModel>> {

        val category1 = Category("1", "Josue Durand", "primero", "image1.png")
        val category2 = Category("2", "Josue Durand", "segundo", "image1.png")
        val category3 = Category("3", "Josue Durand", "segundo", "image1.png")

        val categoryviewmodel1: CategoryViewModel = CategoryViewModel(category1)
        val categoryviewmodel2: CategoryViewModel = CategoryViewModel(category2)
        val categoryviewmodel3: CategoryViewModel = CategoryViewModel(category3)

        arraylist!!.add(categoryviewmodel1)
        arraylist!!.add(categoryviewmodel2)
        arraylist!!.add(categoryviewmodel3)
        arraylist!!.add(categoryviewmodel1)
        arraylist!!.add(categoryviewmodel2)
        arraylist!!.add(categoryviewmodel3)
        arraylist!!.add(categoryviewmodel1)
        arraylist!!.add(categoryviewmodel2)
        arraylist!!.add(categoryviewmodel3)
        arraylist!!.add(categoryviewmodel1)
        arraylist!!.add(categoryviewmodel2)
        arraylist!!.add(categoryviewmodel3)
        arraylistmutablelivedata.value = arraylist

        return arraylistmutablelivedata
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