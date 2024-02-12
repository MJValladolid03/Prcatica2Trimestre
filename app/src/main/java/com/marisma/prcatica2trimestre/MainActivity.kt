package com.marisma.prcatica2trimestre

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.marisma.prcatica2trimestre.adapter.SeriesAdapter
import com.marisma.prcatica2trimestre.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val intent = Intent(this, CreditActivity::class.java)
            val nombre = binding.eTnombre.text.toString()
            intent.putExtra("nombre", nombre)
            startActivity(intent)
        }
    }


}

