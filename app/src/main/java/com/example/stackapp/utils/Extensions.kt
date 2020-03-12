package com.example.stackapp.utils

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun Context.toast(message: String) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

fun FragmentActivity.replaceFragment(fragment: Fragment, frameLayoutId: Int) =
    supportFragmentManager.beginTransaction().replace(frameLayoutId, fragment).commit()