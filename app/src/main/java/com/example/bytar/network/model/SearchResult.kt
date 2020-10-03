package com.example.bytar.network.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchResult(
    val title: String,
    @Json(name = "location_type") val type: String,
    @Json(name = "woeid")val id: Long,
    @Json(name = "latt_long") val latlng: String
)