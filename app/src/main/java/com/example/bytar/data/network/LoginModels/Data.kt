package com.example.bytar.data.network.LoginModels

import com.google.gson.annotations.SerializedName


data class Data (

    @SerializedName("token") val token : TokenModel,
    @SerializedName("user") val user : UserModel
)