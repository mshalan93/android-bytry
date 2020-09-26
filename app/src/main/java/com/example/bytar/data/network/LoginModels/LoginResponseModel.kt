package com.example.bytar.data.network.LoginModels

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json

data class LoginResponseModel(
    @SerializedName("success") val success : Boolean,
    @SerializedName("message") val message : String,
    @SerializedName("data") val data : Data
)