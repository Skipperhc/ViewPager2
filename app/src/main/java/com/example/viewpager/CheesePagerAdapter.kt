package com.example.viewpager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CheesePagerAdapter(private val cheeseStrings: Array<String>) : RecyclerView.Adapter<CheeseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CheeseViewHolder {
        return CheeseViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cheese_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: CheeseViewHolder, position: Int) {
        holder.cheeseName.text = cheeseStrings[position]
    }

    override fun getItemCount() = cheeseStrings.size
}