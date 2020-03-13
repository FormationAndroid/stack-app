package com.example.stackapp.api

import com.example.stackapp.api.models.Questions
import retrofit2.Call
import retrofit2.http.GET

interface StackService {

    @GET("questions?order=desc&sort=activity&site=stackoverflow")
    fun getQuestions(): Call<Questions>

}