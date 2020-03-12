package com.example.stackapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.stackapp.R
import com.example.stackapp.database.AppPrefs
import com.example.stackapp.ui.activities.MainActivity
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        switchNightMode.isChecked = AppPrefs.nightMode
        switchNightMode.setOnCheckedChangeListener { _, isChecked ->
            AppPrefs.nightMode = isChecked
            (activity as MainActivity).recreate()
        }


    }

}
