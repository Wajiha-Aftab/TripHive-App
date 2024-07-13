package com.example.triphive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class karachi : AppCompatActivity() {

    companion object {
        val placesList = ArrayList<dataClass>()
    }

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karachi)

        placesList.add(dataClass("◕ Frere Hall", "Frere Hall, a historic building in Karachi, originally served as the town hall during British colonial times. Today, it houses the Liaquat National Library, hosts cultural events, and features mural paintings by Sadequain.", R.drawable.karachi_frere_hall))
        placesList.add(dataClass("◕ Clifton Beach", "Clifton Beach, also known as Sea View, is a popular beach in Karachi, Sindh, Pakistan. Located on the Arabian Sea, it stretches from Karachi to Ormara in Balochistan. The beach is open 24/7 for the general public and offers leisure activities such as camel rides, horse rides, and motorized buggy rides.", R.drawable.karachi_cliftonbeach))
        placesList.add(dataClass("◕ Empress Market", "Empress Market is a famous marketplace situated in the Saddar Town locality of Karachi, Pakistan. Its origins trace back to the British Raj era when it was first constructed. Today, it stands as one of the most popular and bustling places for shopping in Karachi, reflecting the city’s historical heritage.", R.drawable.karachi_empreess_market))
        placesList.add(dataClass("◕ Mohatta Palace", "The Mohatta Palace is a museum located in Karachi, Sindh, Pakistan. Designed by Agha Ahmed Hussain, the palace was built in 1927 in the posh seaside locale of Clifton as the summer home of Shivratan Mohatta, a Hindu Marwari businessman from what is now the modern-day Indian state of Rajasthan. The palace, characterized by Indo-Saracenic architecture, features pink Jodhpur stone combined with local yellow stone from nearby Gizri.", R.drawable.karachi_mohatta_palace))
        placesList.add(dataClass("◕ Port Building", "The Port of Karachi is one of South Asia’s largest and busiest deep-water seaports, handling approximately 60% of Pakistan’s cargo. Located in Karachi, it serves as a vital gateway for maritime trade with the Central Asian Republics. The historic Karachi Port Trust Building serves as its headquarters.", R.drawable.karachi_port_building))

        recyclerView = findViewById(R.id.recyclerView_karachi)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = Adapter(placesList)
        recyclerView.adapter = adapter
    }
    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
    }
}