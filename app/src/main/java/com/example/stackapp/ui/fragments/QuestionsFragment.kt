package com.example.stackapp.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.stackapp.R
import com.example.stackapp.api.ApiManager
import com.example.stackapp.ui.adapters.QuestionsRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_questions.*

class QuestionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_questions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        ApiManager.getQuestions(
            { questionsList ->
                val adapter = QuestionsRecyclerAdapter(questionsList)
                recyclerQuestions.adapter = adapter
            },
            { message ->
                Log.e("StackApp", "error getQuestion : $message")
            }
        )



    }

}
