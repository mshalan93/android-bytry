package com.example.bytar.data.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.bytar.data.network.IMyApi
import okhttp3.ResponseBody
import retrofit2.Callback
import retrofit2.Response

class UserRepository {
    fun userLogin(email : String , password : String ) : LiveData<String>{
        val loginResponse = MutableLiveData<String>()

        IMyApi().userLogin(email,password)
            .enqueue(object :Callback<ResponseBody>{
                override fun onFailure(call: retrofit2.Call<ResponseBody>, t: Throwable) {
                    loginResponse.value = t.message
                }

                override fun onResponse(
                    call: retrofit2.Call<ResponseBody>,
                    response: Response<ResponseBody>
                ) {
                    if(response.isSuccessful){
                        loginResponse.value = response.body()?.toString()
                    }else{
                        loginResponse.value = response.errorBody().toString()
                    }
                }

            })
        return loginResponse
    }
    fun userSignUp(fristName : String , secondName : String , phone : Int ) : LiveData<String>{
        val loginResponse = MutableLiveData<String>()

        IMyApi().userSignup(fristName,secondName,phone)
            .enqueue(object :Callback<ResponseBody>{
                override fun onFailure(call: retrofit2.Call<ResponseBody>, t: Throwable) {
                    loginResponse.value = t.message
                }

                override fun onResponse(
                    call: retrofit2.Call<ResponseBody>,
                    response: Response<ResponseBody>
                ) {
                    if(response.isSuccessful){
                        loginResponse.value = response.body()?.toString()
                    }else{
                        loginResponse.value = response.errorBody().toString()
                    }
                }

            })
        return loginResponse
    }
}