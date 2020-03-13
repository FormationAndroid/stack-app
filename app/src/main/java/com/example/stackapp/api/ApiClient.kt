package com.example.stackapp.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

const val BASE_URL = "https://api.stackexchange.com/2.2/"

val apiClient: StackService by lazy {
    val retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(OkHttpClient())
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    return@lazy retrofit.create(StackService::class.java)
}