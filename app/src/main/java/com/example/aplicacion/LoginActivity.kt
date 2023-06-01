package com.example.aplicacion

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.app.ActivityCompat
import com.instana.android.core.InstanaConfig

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        checkPermissions()

        val buttonInicio = findViewById<Button>(R.id.buttonInicio)

        buttonInicio.setOnClickListener {
            val intent = Intent(this, PrimerMensajeActivity::class.java)
            startActivity(intent)
        }

        val buttonInstana = findViewById<Button>(R.id.buttonInstana)

        buttonInstana.setOnClickListener {
            val intent = Intent(this, InstanaActivity::class.java)
            startActivity(intent)
        }
    }

    private fun checkPermissions() {
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            //permiso denegado
            requestReadPhonePermission()
        } else {
            //permiso aceptado
            Toast.makeText(this, "Permiso aceptado.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun requestReadPhonePermission() {
        if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.READ_PHONE_STATE)){
            //El usuario ya ha rechazado el permiso
            Toast.makeText(this, "Permiso rechazado.", Toast.LENGTH_SHORT).show()
        }else{
            //pedir permisos
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_PHONE_STATE), 777)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 777) { //nuestro permiso
            if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            }else{
                //el permiso no ha sido aceptado
                Toast.makeText(this, "Permiso rechazado por primera vez.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}