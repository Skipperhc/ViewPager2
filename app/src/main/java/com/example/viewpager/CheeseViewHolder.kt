package com.example.viewpager

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CheeseViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val cheeseName: TextView = view.findViewById(R.id.cheese_name)

}