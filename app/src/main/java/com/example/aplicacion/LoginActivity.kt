package com.example.aplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonInicio = findViewById<Button>(R.id.buttonInicio)

        buttonInicio.setOnClickListener {
            val intent = Intent(this, PrimerMensajeActivity::class.java)
            startActivity(intent)
        }
    }

}