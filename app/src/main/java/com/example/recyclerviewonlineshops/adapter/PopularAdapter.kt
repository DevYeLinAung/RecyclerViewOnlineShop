package com.example.recyclerviewonlineshops.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewonlineshops.R
import com.example.recyclerviewonlineshops.model.PopularProduct
import kotlinx.android.synthetic.main.popular_product.view.*

class PopularViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var name = itemView.findViewById<TextView>(R.id.txt_popular_name)
    var brand = itemView.findViewById<TextView>(R.id.txt_popular_brand)
    var image = itemView.findViewById<ImageView>(R.id.image_popular)
    var price = itemView.findViewById<TextView>(R.id.txt_popular_price)
}

class PopularAdapter(var popularList: ArrayList<PopularProduct>) :
    RecyclerView.Adapter<PopularViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.popular_product, parent, false)
        return PopularViewHolder(view)


    }

    override fun getItemCount(): Int {
        return popularList.size

    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.name.text = popularList[position].name
        holder.brand.text = popularList[position].brand
        holder.image.setImageResource(popularList[position].image)
        holder.price.text = popularList[position].price

    }

}