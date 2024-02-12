package com.marisma.prcatica2trimestre

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.marisma.prcatica2trimestre.databinding.ActivityCreditBinding

class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCreditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Access the TextView using binding
        val nombreUsuario = intent.getStringExtra("nombre")
        binding.tvMessage.text = getString(R.string.info, nombreUsuario)

        // Handle the contact button click using binding
        binding.Contactar.setOnClickListener {
            enviarCorreoConsulta(nombreUsuario)
        }

        // Handle the series button click using binding
        binding.btnSeries.setOnClickListener {
            val intent = Intent(this@CreditActivity, SeriesProvider::class.java)
            startActivity(intent)
        }
    }

    private fun enviarCorreoConsulta(nombreApp: String?) {
        val direccionCorreo = "mvalcar1711@g.educaand.es"
        val asunto = "Consulta de la app $nombreApp"

        // Crear un intent implícito para enviar correo electrónico
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:$direccionCorreo")
            putExtra(Intent.EXTRA_SUBJECT, asunto)
        }
        startActivity(intent)
    }
}