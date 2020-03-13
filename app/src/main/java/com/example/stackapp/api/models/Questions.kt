package com.example.stackapp.api.models


import com.squareup.moshi.Json

data class Questions(
    @field:Json(name = "has_more")
    val hasMore: Boolean,
    val items: List<Item>,
    @field:Json(name = "quota_max")
    val quotaMax: Int,
    @field:Json(name = "quota_remaining")
    val quotaRemaining: Int
)