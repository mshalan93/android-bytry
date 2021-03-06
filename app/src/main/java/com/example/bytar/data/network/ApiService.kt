package com.example.bytar.data.network


import com.example.bytar.data.network.login_models.LoginResponseModel
import com.example.bytar.data.network.registermodel.VerifyNumberModel
import kotlinx.coroutines.Deferred
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface ApiService {
    @FormUrlEncoded
    @POST("login")
    fun Login(
        @Field("phone") phone : String,
        @Field("password") password : String,
        @Field("language") language : String,
        @Field("notification_id") notification_id : Int,
        @Field("device_type") device_type : Int,
        @Field("os_version") os_version : String
    ): Deferred<LoginResponseModel>

    @FormUrlEncoded
    @POST("verify")
    fun VerifyNumber(
        @Field("phone") phone : String
    ): Deferred<VerifyNumberModel>
}


