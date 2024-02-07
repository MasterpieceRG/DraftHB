package com.example.presentationproject.AdapterCategories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.presentationproject.R

class CategorieItemAdapter(private val menuList: ArrayList<CategorieItems>): RecyclerView.Adapter<CategorieItemAdapter.MyViewHolder>() {

    var onItemClick:((CategorieItems) -> Unit)? = null

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val image: ImageView = view.findViewById(R.id.categoriesImage)
        val name: TextView = view.findViewById(R.id.categoriesName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.categories_items, parent,false))
    }

    override fun getItemCount(): Int {
        return menuList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val location = menuList[position]
        holder.image.setImageResource(location.image)
        holder.name.text = location.name

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(location)
        }
    }
}