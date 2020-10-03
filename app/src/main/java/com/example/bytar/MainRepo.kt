package com.example.bytar

import com.example.bytar.common.IRepo
import com.example.bytar.network.services.LoginService


class MainRepo() : IRepo {

    fun makeSearchWith(search: String) =
        getNetworkClient().create(LoginService::class.java).getSearchResult(search)
}