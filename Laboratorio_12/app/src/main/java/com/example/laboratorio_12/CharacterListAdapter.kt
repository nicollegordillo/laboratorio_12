package com.example.laboratorio_12

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CharacterListAdapter(private val characterList: List<Character>) :
    RecyclerView.Adapter<CharacterListAdapter.CharacterViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.character_cards, parent, false)
            return CharacterViewHolder(view)
        }

        override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
            val character = characterList[position]
            holder.characterName.text = character.name
            Glide.with(holder.itemView.context)
                .load(character.image)
                .into(holder.characterImage)
        }

        override fun getItemCount(): Int {
            return characterList.size
        }

        class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val characterName: TextView = itemView.findViewById(R.id.CharacterName)
            val characterImage: ImageView = itemView.findViewById(R.id.CharacterImage)
        }
}