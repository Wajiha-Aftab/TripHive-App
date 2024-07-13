package com.example.triphive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class naran_kaghan : AppCompatActivity() {

    companion object {
        val placesList = ArrayList<dataClass>()
    }

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naran_kaghan)

        placesList.add(dataClass("◕ Saif ul Malook", "Lake Saif ul Malook, set in the majestic Kaghan Valley of Pakistan, is an enchanting alpine lake at 3,224 meters (10,578 feet) above sea level. Known for its crystal-clear waters and framed by the towering peaks of the Himalayas, it’s a place of breathtaking natural beauty and local legends.", R.drawable.naran_saif_ul_malook))
        placesList.add(dataClass("◕ Babusar Top", "Babusar Top, also known as Babusar Pass, is a high mountain pass at 4,173 meters (13,691 feet) in Pakistan’s Kaghan Valley. It’s the highest accessible point in the valley by car, offering breathtaking views and a gateway between Khyber Pakhtunkhwa and Gilgit-Baltistan. The pass is popular among tourists during summer but is closed in winter due to heavy snowfall.", R.drawable.naran_babusar_top))
        placesList.add(dataClass("◕ Shogran", "Shogran is a serene hill station perched at 2,362 meters (7,749 feet) in Pakistan’s Kaghan Valley. It’s celebrated for its lush green meadows, pine forests, and panoramic mountain views, offering a tranquil retreat from the bustling city life", R.drawable.naran_shogran))
        placesList.add(dataClass("◕ Lalusar Lake", "Lulusar Lake is a stunning high-altitude lake in Pakistan's Kaghan Valley, known for its clear waters and scenic beauty. It's the source of the Kunhar River and a favorite spot for tourists, easily reachable from Naran.", R.drawable.naran_lalusar_lake))
        placesList.add(dataClass("◕ Sharan Forest", "Sharan Forest is a secluded gem in Pakistan’s Kaghan Valley, known for its dense pine forests and rich biodiversity. It offers a peaceful retreat with activities like hiking and camping, and is accessible via a 16km jeep track from Paras.", R.drawable.naran_sharan_forest))

        recyclerView = findViewById(R.id.recyclerView_naran_kaghan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = Adapter(placesList)
        recyclerView.adapter = adapter
    }
    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
    }
}