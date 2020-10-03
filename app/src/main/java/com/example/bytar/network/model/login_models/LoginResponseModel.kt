package com.example.bytar.network.login_models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class LoginResponseModel(
    @Json(name = "success") val success : Boolean,
    @Json(name = "message") val message : String,
    @Json(name = "data") val data : Data
)