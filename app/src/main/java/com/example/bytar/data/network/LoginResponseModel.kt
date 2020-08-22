package com.example.bytar.data.network

import com.squareup.moshi.Json

data class LoginResponseModel(
    val id: String,
    @Json(name = "img_src")
    val imgSrcUrl: String
)