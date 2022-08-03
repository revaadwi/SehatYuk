package com.app.sehatyuk

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(private val menu: ArrayList<Menu>): RecyclerView.Adapter<MenuAdapter.ViewHolder>(){


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title : TextView = itemView.findViewById(R.id.IV_title)
        val icon : ImageView = itemView.findViewById(R.id.IV_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = menu[position]
        holder.icon.setImageResource(currentItem.icon)
        holder.title.text = currentItem.title
    }

    override fun getItemCount(): Int {
        return menu.size
    }
}