package com.example.appuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appuno.imccalculator.IMCCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        btnSaludar.setOnClickListener{ navigateToSaludar()}

        val btnIMC = findViewById<Button>(R.id.btnIMC)
        btnIMC.setOnClickListener{ navigateToIMCApp() }


    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, IMCCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludar() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}