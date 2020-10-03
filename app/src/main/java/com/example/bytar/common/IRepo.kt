package com.example.bytar.common
import com.example.bytar.network.AppNetwork
import retrofit2.Retrofit

interface IRepo {

    fun getNetworkClient(): Retrofit = AppNetwork.getClient()
}