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

class SphereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sphere)

        val textView = findViewById<TextView>(R.id.textView)
        val resultText:TextView = findViewById(R.id.resultTextView)
        val button:Button = findViewById(R.id.btn1)
        val editText = findViewById<EditText>(R.id.editText_Sphere)

        button.setOnClickListener{
            var radius = editText.text.toString()
            var r = Integer.parseInt(radius)
            val volume = (4/3)*3.142857*r*r*r
            val v = BigDecimal(volume).setScale(3, RoundingMode.HALF_UP).toDouble()
            resultText.text = "V= $v m^3"
        }
    }
}