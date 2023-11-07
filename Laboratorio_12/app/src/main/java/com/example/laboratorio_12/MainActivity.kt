package com.example.laboratorio_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.GridView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var searchEditText: EditText
    private lateinit var searchButton: Button
    private val characters = mutableListOf<Character>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (resources.configuration.screenWidthDp >= 600) {
            setContentView(R.layout.activity_main_tablet)
            val gridView = findViewById<GridView>(R.id.characterGridView)
            // Configure the GridView for the grid layout on tablets
            // Set an adapter to populate the grid with data
            val gridAdapter = CharacterGridAdapter(characters)
            gridView.adapter = gridAdapter
            characters.add(Character("Harry Potter", R.drawable.harrypotter))
            characters.add(Character("Hermione Granger", R.drawable.hermionegranger))
            characters.add(Character("Ron Weasley", R.drawable.ronweasley))
            characters.add(Character("Albus Dumbledore", R.drawable.albusdumbledore))
            characters.add(Character("Draco Malfoy", R.drawable.dracomalfoy))
            characters.add(Character("Luna Lovegood", R.drawable.lunalovegood))
            characters.add(Character("Severus Snape", R.drawable.severussnape))
            characters.add(Character("Tom Ryddle", R.drawable.tomryddle))
        } else {
            setContentView(R.layout.activity_main)
            val recyclerView = findViewById<RecyclerView>(R.id.characterRecyclerView)
            val listAdapter = CharacterListAdapter(characters)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = listAdapter

            characters.add(Character("Harry Potter", R.drawable.harrypotter))
            characters.add(Character("Hermione Granger", R.drawable.hermionegranger))
            characters.add(Character("Ron Weasley", R.drawable.ronweasley))
            characters.add(Character("Albus Dumbledore", R.drawable.albusdumbledore))
            characters.add(Character("Draco Malfoy", R.drawable.dracomalfoy))
            characters.add(Character("Luna Lovegood", R.drawable.lunalovegood))
            characters.add(Character("Severus Snape", R.drawable.severussnape))
            characters.add(Character("Tom Ryddle", R.drawable.tomryddle))
            searchEditText = findViewById(R.id.searchEditText)
            searchButton = findViewById(R.id.searchButton)
            searchButton.setOnClickListener {
                val query = searchEditText.text.toString().toLowerCase()
                val filteredCharacters = characters.filter { it.name.toLowerCase().contains(query) }

            }
        }


    }
}