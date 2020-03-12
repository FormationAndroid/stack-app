package com.example.stackapp.ui.activities

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.stackapp.R
import com.example.stackapp.ui.fragments.AboutFragment
import com.example.stackapp.ui.fragments.QuestionsFragment
import com.example.stackapp.ui.fragments.SettingsFragment
import com.example.stackapp.utils.replaceFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun menuClick(view: View) {
        when (view){
            btnQuestions -> replaceFragment(QuestionsFragment(), R.id.frameLayout)
            btnSettings -> replaceFragment(SettingsFragment(), R.id.frameLayout)
            btnAbout -> replaceFragment(AboutFragment(), R.id.frameLayout)
        }
    }


}



