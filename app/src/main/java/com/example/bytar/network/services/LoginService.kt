package com.example.bytar.network.services
import com.example.bytar.data.network.login_models.LoginResponseModel
import com.example.bytar.network.model.SearchResult
import io.reactivex.rxjava3.core.Single
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.http.*


interface LoginService {

/*
    @GET("location/search")
    fun getSearchResult(@Query("query") query: String): Single<List<SearchResult>>
*/

    @FormUrlEncoded
    @POST("login")
    fun Login(
        @Field("phone") phone : String,
        @Field("password") password : String,
        @Field("language") language : String,
        @Field("notification_id") notification_id : Int,
        @Field("device_type") device_type : Int,
        @Field("os_version") os_version : String
    ) : Call<LoginResponseModel>

}