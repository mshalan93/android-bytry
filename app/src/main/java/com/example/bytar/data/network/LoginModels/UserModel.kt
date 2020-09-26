package com.example.bytar.data.network.LoginModels

import com.google.gson.annotations.SerializedName


data class UserModel (

    @SerializedName("id") val id : Int,
    @SerializedName("name") val name : String,
    @SerializedName("phone") val phone : Int,
    @SerializedName("role") val role : Int,
    @SerializedName("language") val language : String,
    @SerializedName("device_id") val device_id : Int,
    @SerializedName("notification_id") val notification_id : Int,
    @SerializedName("device_type") val device_type : String,
    @SerializedName("os_version") val os_version : Double,
    @SerializedName("created_at") val created_at : String,
    @SerializedName("updated_at") val updated_at : String
)