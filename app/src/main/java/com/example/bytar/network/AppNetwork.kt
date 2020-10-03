package com.example.bytar.network

import com.example.bytar.BuildConfig
import okhttp3.logging.HttpLoggingInterceptor

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object AppNetwork : INetwork {

    private lateinit var retrofit: Retrofit
    private lateinit var moshi: Moshi
    private lateinit var okHttpClient: OkHttpClient

    override val BASE_URL: String
        get() = BuildConfig.BASE_URL

    override fun getClient(): Retrofit = if (!::retrofit.isInitialized){
        retrofit = Retrofit.Builder().addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create(getMoshi()))
            .baseUrl(BASE_URL)
            .client(getOkHttpClient()).build()
        retrofit
    }else retrofit

    override fun getOkHttpClient(): OkHttpClient = if (!::okHttpClient.isInitialized) {
        okHttpClient = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }).build()
        okHttpClient
    } else okHttpClient

    private fun getMoshi(): Moshi = if (!::moshi.isInitialized) {
        moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        moshi
    } else moshi
}