package com.example.bytar.ui.auth

import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bytar.data.network.LoginApiService
import com.example.bytar.data.repositories.LoginApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


class LoginViewModel : ViewModel() {

    private val _response = MutableLiveData<String>()
    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main )

    val response: LiveData<String>
        get() = _response

    private val email = MutableLiveData<String>()
    val _email: LiveData<String>
        get() = email

    private val password = MutableLiveData<String>()
    val _password: LiveData<String>
        get() = password


    /**
     * Sets the value of the status LiveData to the Mars API status.
     */

      fun Login() {
        // _response.value = "Set the Mars API Response here!"
    /*    coroutineScope.launch {
            var LoginDeferred = LoginApi.retrofitService.Login(email ="mohamed@gmail.com" ,password = "123")
            try {
                var listResult = LoginDeferred.await()
                _response.value = "Success: yu are Loged in"
            } catch (e: Exception) {
                _response.value = "Failure: ${e.message}"
            }
        }*/
        Log.d("Login dada", "\"email is  ${email.value.toString()} and password is ${password.value.toString()} \"")
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}