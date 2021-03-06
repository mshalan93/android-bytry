package com.example.bytar.ui.auth

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bytar.data.repositories.LoginApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


class LoginViewModel : ViewModel() {

    private val _response = MutableLiveData<String>()
    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main )


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

     coroutineScope.launch {
            val LoginDeferred = LoginApi.RETROFIT_SERVICE.Login( phone ="+966547551611" ,password = "0163212392",language = "ar",device_type = 2121,notification_id = 2125412,os_version = "10.3")
            try {
                val listResult = LoginDeferred.await()
                _response.value = "Success: yu are Loged in"
                Log.d("login response",listResult.toString() + " " + listResult.success  +  listResult.data)

            } catch (e: Exception) {
                _response.value = "Failure: ${e.message}"
                Log.d("login error response","${e.message}" )

            }

        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}