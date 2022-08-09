package com.example.manuelexample

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.adapters.CarAdapter
import com.example.models.Car

class MainActivity : AppCompatActivity() {

    private val carros = listOf(
        Car(R.drawable.camaro, "Camaro", 2022, "Chevrolet"),
        Car(R.drawable.mustang, "Mustang", 2022, "Ford"),
        Car(R.drawable.viper, "Viper", 2022, "Dodge"),
        Car(R.drawable.supra, "Supra", 2022, "Toyota")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lista = findViewById<ListView>(R.id.listaNombres)
        val adapter = CarAdapter(this, carros)
        lista.adapter = adapter
    }
}