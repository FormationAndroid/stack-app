package com.example.stackapp.api.models


import com.squareup.moshi.Json

data class Owner(
    @field:Json(name = "display_name")
    val displayName: String,
    val link: String,
    @field:Json(name = "profile_image")
    val profileImage: String,
    val reputation: Int,
    @field:Json(name = "user_id")
    val userId: Int,
    @field:Json(name = "user_type")
    val userType: String
)