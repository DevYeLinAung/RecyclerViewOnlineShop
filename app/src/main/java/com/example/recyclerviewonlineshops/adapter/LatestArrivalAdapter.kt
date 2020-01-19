package com.example.recyclerviewonlineshops.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewonlineshops.R
import com.example.recyclerviewonlineshops.model.LatestArrival

class LatestArrivalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image = itemView.findViewById<ImageView>(R.id.image_latest_arrival)
    var name = itemView.findViewById<TextView>(R.id.txt_name)
    var brand = itemView.findViewById<TextView>(R.id.name_brand)
    var price = itemView.findViewById<TextView>(R.id.txt_price)
}

class LatestArrivalAdapter(var latestList: ArrayList<LatestArrival>) :
    RecyclerView.Adapter<LatestArrivalViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestArrivalViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_latest_arrival, parent, false)
        return LatestArrivalViewHolder(view)

    }

    override fun getItemCount(): Int {
        return latestList.size


    }

    override fun onBindViewHolder(holder: LatestArrivalViewHolder, position: Int) {
        holder.image.setImageResource(latestList[position].image)
        holder.name.text = latestList[position].name
        holder.brand.text = latestList[position].brand
        holder.price.text = latestList[position].price.toString()

    }

}