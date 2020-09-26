package com.example.bytar.data.network


import com.example.bytar.data.network.LoginModels.LoginResponseModel
import kotlinx.coroutines.Deferred
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


interface LoginApiService {
    @FormUrlEncoded
    @POST("login")
    fun Login(
        @Field("phone") phone : String,
        @Field("password") password : String,
        @Field("language") language : String,
        @Field("notification_id") notification_id : Int,
        @Field("device_type") device_type : Int,
        @Field("os_version") os_version : String
    ): Deferred<List<LoginResponseModel>>
}


