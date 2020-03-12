package com.example.stackapp.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stackapp.R
import com.example.stackapp.utils.toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnConnect.setOnClickListener {
            if (editPassword.text.toString() == "password")
                startActivity(Intent(applicationContext, MainActivity::class.java))
            else
                toast("Mot de passe invalide")
        }

    }
}
