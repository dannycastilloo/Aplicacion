package com.example.aplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class SegundoMensajeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundo_mensaje)

        val mensajes2 = listOf(
            "Adiós",
            "No pudiste ingresar",
            30,
            false,
            20.0
        )

        val textViewRandomMessage2 = findViewById<TextView>(R.id.textViewRandomMessage2)
        val random2 = Random()
        val indice2 = random2.nextInt(mensajes2.size)
        val mensajeAleatorio2 = mensajes2[indice2]
        textViewRandomMessage2.text = mensajeAleatorio2.toString()

        val buttonAtras = findViewById<Button>(R.id.buttonAtras)

        buttonAtras.setOnClickListener {
            val intent = Intent(this, PrimerMensajeActivity::class.java)
            startActivity(intent)
        }

        val buttonSalir = findViewById<Button>(R.id.buttonSalir)

        buttonSalir.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}