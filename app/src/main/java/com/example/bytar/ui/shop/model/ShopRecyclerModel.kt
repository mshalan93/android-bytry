package com.example.bytar.ui.shop.model

class ShopRecyclerModel

{
    var id = ""
    var title = ""
    var desc=""
    var imagepath=""

    constructor(id: String, title: String, desc: String, imagepath: String) {
        this.id = id
        this.title = title
        this.desc = desc
        this.imagepath = imagepath
    }
}