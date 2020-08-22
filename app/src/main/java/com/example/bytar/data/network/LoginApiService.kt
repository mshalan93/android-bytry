package com.example.bytar.data.network


import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


interface LoginApiService {
    @GET("Login")
    fun Login(
        @Field("email") email : String,
        @Field("password") password : String
    ): Deferred<List<LoginResponseModel>>
}


