package com.example.stackapp.database

import com.chibatching.kotpref.KotprefModel

object AppPrefs : KotprefModel() {
    var nightMode by booleanPref(default = false)
}