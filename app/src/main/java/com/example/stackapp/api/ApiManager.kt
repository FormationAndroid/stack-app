package com.example.stackapp.api

import com.example.stackapp.api.models.Item
import com.example.stackapp.api.models.Questions
import retrofit2.Call
import retrofit2.Response

object ApiManager {

    fun getQuestions(success: (questionsList : List<Item>) -> Unit, fail: (message : String) -> Unit){

        apiClient.getQuestions().enqueue(object : retrofit2.Callback<Questions>{

            override fun onResponse(call: Call<Questions>, response: Response<Questions>) {
                if (response.isSuccessful)
                    response.body()?.let { questions -> success(questions.items) } ?: fail("no questions")
                else
                    fail("response not successful")
            }

            override fun onFailure(call: Call<Questions>, t: Throwable) = fail("onFailure $t")

        })

    }

}