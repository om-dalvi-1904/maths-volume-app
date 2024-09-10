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

class CubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cube)

        val textview:TextView = findViewById(R.id.textView)
        val editText:EditText = findViewById(R.id.editText_Sphere)
        val resultText = findViewById<TextView>(R.id.resultTextView)
        val button:Button = findViewById(R.id.btn1)

        button.setOnClickListener{
            var length = editText.text.toString()
            var l = Integer.parseInt(length)
            val volume = l*l*l
            val v = BigDecimal(volume).setScale(3, RoundingMode.HALF_UP).toDouble()
            resultText.text = "V= $v m^3"
        }
    }
}