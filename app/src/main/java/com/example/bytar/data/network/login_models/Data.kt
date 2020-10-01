package com.example.bytar.data.network.login_models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Data (

    @Json(name = "token") val token : TokenModel,
    @Json(name ="user") val user : UserModel
)