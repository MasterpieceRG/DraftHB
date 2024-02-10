package com.example.presentationproject.AdapterMenu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.presentationproject.R

class MenuAdapter(private val menuList:ArrayList<MealTypes>): RecyclerView.Adapter<MenuAdapter.MyViewHolder>() {

    var onItemClick:((MealTypes) -> Unit)? = null

    class MyViewHolder(view: View):RecyclerView.ViewHolder(view){
        val image:ImageView = view.findViewById(R.id.itemImage)
        val itemName:TextView = view.findViewById(R.id.itemName)
        val availablePan:TextView = view.findViewById(R.id.availablePan)
        val price:TextView = view.findViewById(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_items, parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val location = menuList[position]
        holder.image.setImageResource(location.itemImage)
        holder.itemName.text = location.itemName
        holder.availablePan.text = location.availablePan
        holder.price.text = location.price

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(location)
        }
    }
}