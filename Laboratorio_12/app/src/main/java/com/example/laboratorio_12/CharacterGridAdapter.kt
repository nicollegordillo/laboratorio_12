package com.example.laboratorio_12

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class CharacterGridAdapter(private val characterList: List<Character>) : BaseAdapter() {

    override fun getCount(): Int {
        return characterList.size
    }

    override fun getItem(position: Int): Any {
        return characterList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val character = characterList[position]
        val characterView: View

        if (convertView == null) {
            val inflater = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            characterView = inflater.inflate(R.layout.character_cards, null)
        } else {
            characterView = convertView
        }

        val holder = CharacterListAdapter.CharacterViewHolder(characterView)
        holder.characterName.text = character.name

        Glide.with(holder.itemView.context)
            .load(character.image)
            .into(holder.characterImage)

        return characterView
    }
}



