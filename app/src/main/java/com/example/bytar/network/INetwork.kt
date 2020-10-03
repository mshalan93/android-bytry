package com.example.bytar.network


import okhttp3.OkHttpClient
import retrofit2.Retrofit

interface INetwork {

    val BASE_URL: String

    fun getClient():Retrofit

    fun getOkHttpClient(): OkHttpClient


}