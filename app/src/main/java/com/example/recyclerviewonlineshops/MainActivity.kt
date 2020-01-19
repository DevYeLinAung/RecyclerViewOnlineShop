package com.example.recyclerviewonlineshops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewonlineshops.adapter.CountryAdapter
import com.example.recyclerviewonlineshops.adapter.LatestArrivalAdapter
import com.example.recyclerviewonlineshops.adapter.PopularAdapter
import com.example.recyclerviewonlineshops.model.Country
import com.example.recyclerviewonlineshops.model.LatestArrival
import com.example.recyclerviewonlineshops.model.PopularProduct

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        latestArrivalView()
        countryView()
        popularView()
    }

    fun latestArrivalView() {
        var latestArrivalRecyclerView: RecyclerView = findViewById(R.id.recycler_latestArrival)
        var latestArrivalList = ArrayList<LatestArrival>()
        latestArrivalList.add(
            LatestArrival(
                R.drawable.tshirt,
                "T Shirt Man",
                "Jack Cordee fashion",
                "15000Ks"
            )
        )
        latestArrivalList.add(LatestArrival(R.drawable.girl_dress, "Summer Dress", "D2", "10000Ks"))
        latestArrivalList.add(
            LatestArrival(
                R.drawable.shirt,
                "Cotton-Casual-Shirt",
                "Indo Primo",
                "20000Ks"
            )
        )
        latestArrivalList.add(
            LatestArrival(
                R.drawable.scart,
                "Short Hand Mini Scart",
                "D2",
                "13500Ks"
            )
        )

        var latestArrivalAdapter = LatestArrivalAdapter(latestArrivalList)
        latestArrivalRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        latestArrivalRecyclerView.adapter = latestArrivalAdapter
    }

    fun countryView() {
        var countyRecyclerView: RecyclerView = findViewById(R.id.recycler_country)
        var countryList = ArrayList<Country>()
        countryList.add(Country(R.drawable.japan, "Japan"))
        countryList.add(Country(R.drawable.china, "China"))
        countryList.add(Country(R.drawable.korea, "Korea"))
        countryList.add(Country(R.drawable.international, "International"))

        var countryAdapter = CountryAdapter(countryList)
        countyRecyclerView.layoutManager =GridLayoutManager(this,2)
        countyRecyclerView.adapter =countryAdapter
    }
    fun popularView(){
        var popularRecyclerView:RecyclerView= findViewById(R.id.recycler_popular_product)
        var popularList= ArrayList<PopularProduct>()
        popularList.add(PopularProduct("Iphone 8Plus","Apple",R.drawable.iphone,"890000Ks"))
        popularList.add(PopularProduct("Iphone X","Apple",R.drawable.iphonex,"1200000Ks"))
        popularList.add(PopularProduct("Iphone 11","Apple",R.drawable.iphone11,"1320000Ks"))

        var popularAdapter=PopularAdapter(popularList)
        popularRecyclerView.layoutManager=LinearLayoutManager(this)
        popularRecyclerView.adapter=popularAdapter
    }
}
