package com.example.bytar

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bytar.network.model.SearchResult


class MainViewModel(private val repo: MainRepo = MainRepo()) : IViewModel, ViewModel() {

 /*   private val searchResult: MutableLiveData<List<SearchResult>> by lazy {
        MutableLiveData()
    }

    val searchResult_: LiveData<List<SearchResult>> = searchResult

    fun executeSearch(search: String) {
        repo.makeSearchWith(search)
            .compose(getIoTransformer())
            .subscribe({
                searchResult.value = it
            }, {
                Log.d(MainViewModel::class.java.simpleName, "executeSearch: ${it.localizedMessage}")
            })
    }
*/}