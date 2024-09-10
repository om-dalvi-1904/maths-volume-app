package com.example.volumecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.math.BigDecimal
import java.math.RoundingMode

class CylinderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cylinder)

        val textview = findViewById<TextView>(R.id.textView)
        val resultText = findViewById<TextView>(R.id.resultTextView)
        val button:Button = findViewById(R.id.btn1)
        val editRadius = findViewById<EditText>(R.id.editRadius)
        val editHeight:EditText = findViewById(R.id.editHeight)

        button.setOnClickListener{
            var radius = editRadius.text.toString()
            var r = Integer.parseInt(radius)
            var height = editHeight.text.toString()
            var h = Integer.parseInt(height)
            val volume = 3.1428*r*r*h
            val v = BigDecimal(volume).setScale(3, RoundingMode.HALF_UP).toDouble()
            resultText.text = "V= $v m^3"
        }
    }
}