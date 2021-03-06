package com.example.bytar.network.login_models

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)

data class TokenModel (

    @Json(name ="token_type") val token_type : String,
    @Json(name ="expires_in") val expires_in : Int,
    @Json(name ="access_token") val access_token : String,
    @Json(name ="refresh_token") val refresh_token : String
)