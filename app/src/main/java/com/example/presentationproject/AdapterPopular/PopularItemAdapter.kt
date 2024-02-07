package com.example.presentationproject.AdapterPopular

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.presentationproject.R

class PopularItemAdapter(private val menuList:ArrayList<PopularItems>): RecyclerView.Adapter<PopularItemAdapter.MyViewHolder>() {

    var onItemClick:((PopularItems) -> Unit)? = null

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.popularItemImage)
        val name:TextView = view.findViewById(R.id.popularItemName)
        val price:TextView = view.findViewById(R.id.popularItemPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.popular_items, parent,false))
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val location = menuList[position]
        holder.image.setImageResource(location.image)
        holder.name.text = location.name
        holder.price.setText(location.price)

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(location)
        }
    }
}