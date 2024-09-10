package com.example.volumecalculator

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //the view
        val gridView: GridView = findViewById(R.id.gridView)

        //the dataset
        var shape1:Shape = Shape(R.drawable.sphere, "Sphere")
        var shape2:Shape = Shape(R.drawable.cube, "Cube")
        var shape3:Shape = Shape(R.drawable.rectangle, "Rectangle")
        var shape4:Shape = Shape(R.drawable.cylinder, "Cylinder")

        val gridItems = listOf<Shape>(shape1, shape2, shape3, shape4)

        //setting the adapters
        val customAdapter = MyCustomAdapter(this, gridItems)
        gridView.adapter = customAdapter

        //handling on click events
        gridView.setOnItemClickListener { _, _, position, _ ->
            val clickedItem = customAdapter.getItem(position)

            if(clickedItem?.shapeName.equals("Sphere")){
                val i = Intent(this, SphereActivity::class.java)
                startActivity(i)
            }else if (clickedItem?.shapeName.equals("Cube")){
                val i = Intent(this, CubeActivity::class.java)
                startActivity(i)
            }else if (clickedItem?.shapeName.equals("Cylinder")){
                val i = Intent(this, CylinderActivity::class.java)
                startActivity(i)
            }
        }
    }
}