package com.example.bytar.data.network.LoginModels

import com.google.gson.annotations.SerializedName

data class TokenModel (

    @SerializedName("token_type") val token_type : String,
    @SerializedName("expires_in") val expires_in : Int,
    @SerializedName("access_token") val access_token : String,
    @SerializedName("refresh_token") val refresh_token : String
)