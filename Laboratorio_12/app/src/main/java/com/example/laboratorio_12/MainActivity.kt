package com.example.laboratorio_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (resources.configuration.screenWidthDp >= 600) {
            setContentView(R.layout.activity_main_tablet)
            val gridView = findViewById<GridView>(R.id.characterGridView)
            // Configure the GridView for the grid layout on tablets
            // Set an adapter to populate the grid with data
        } else {
            setContentView(R.layout.activity_main)
            val recyclerView = findViewById<RecyclerView>(R.id.characterRecyclerView)
            // Configure the RecyclerView for the list layout on phones
            // Set an adapter to populate the list with data
        }

    }
}