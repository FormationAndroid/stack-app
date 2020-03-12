package com.example.stackapp.ui.activities

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.stackapp.R
import com.example.stackapp.database.AppPrefs
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

    override fun getTheme(): Resources.Theme {
        val theme: Resources.Theme = super.getTheme()
        if (AppPrefs.nightMode)
            theme.applyStyle(R.style.SpecialTheme, true)
        return theme
    }

}



