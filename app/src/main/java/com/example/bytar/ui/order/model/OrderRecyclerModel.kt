package com.example.bytar.ui.order.model

class OrderRecyclerModel

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