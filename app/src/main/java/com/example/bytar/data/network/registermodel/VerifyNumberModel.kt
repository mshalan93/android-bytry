package com.example.bytar.data.network.registermodel

import com.google.gson.annotations.SerializedName

data class VerifyNumberModel (

    @SerializedName("success") val success : Boolean,
    @SerializedName("message") val message : String,
    @SerializedName("data") val data : Int
)