package com.example.stackapp.api

import com.example.stackapp.api.models.Questions
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface StackService {

    @GET("questions")
    fun getQuestions(
        @Query("order") order :String = "desc",
        @Query("sort") sort :String = "activity",
        @Query("site") site :String = "stackoverflow",
        @Query("tagged") tagged : String
    ): Call<Questions>

}