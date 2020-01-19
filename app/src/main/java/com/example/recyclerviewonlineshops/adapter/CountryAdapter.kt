package com.example.recyclerviewonlineshops.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewonlineshops.R
import com.example.recyclerviewonlineshops.model.Country
import kotlinx.android.synthetic.main.choose_country.view.*

class countryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var image = itemView.findViewById<ImageView>(R.id.image_country)
    var name = itemView.findViewById<TextView>(R.id.txt_country_name)

}
class CountryAdapter (var countryList:ArrayList<Country>):RecyclerView.Adapter<countryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): countryViewHolder {
var view= LayoutInflater.from(parent.context).inflate(R.layout.choose_country,parent,false)
        return countryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size

    }

    override fun onBindViewHolder(holder: countryViewHolder, position: Int) {
        holder.image.setImageResource(countryList[position].image)
        holder.name.text=countryList[position].name

    }

}