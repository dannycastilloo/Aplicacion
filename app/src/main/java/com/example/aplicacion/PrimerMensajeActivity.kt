package com.example.aplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class PrimerMensajeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer_mensaje)

        val mensajes = listOf(
            "Bienvenido",
            "Ingresaste correctamente",
            20,
            true,
            10.0
        )

        val textViewRandomMessage1 = findViewById<TextView>(R.id.textViewRandomMessage1)
        val random1 = Random()
        val indice1 = random1.nextInt(mensajes.size)
        val mensajeAleatorio1 = mensajes[indice1]

        textViewRandomMessage1.text = mensajeAleatorio1.toString()

        val buttonSiguiente = findViewById<Button>(R.id.buttonSiguiente)

        buttonSiguiente.setOnClickListener {
            val intent = Intent(this, SegundoMensajeActivity::class.java)
            startActivity(intent)
        }

        val buttonSalir = findViewById<Button>(R.id.buttonSalir)

        buttonSalir.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }


}