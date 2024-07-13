package com.example.triphive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class lahore : AppCompatActivity() {

    companion object {
        val placesList = ArrayList<dataClass>()
    }

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lahore)

        placesList.add(dataClass("◕ Shahi Qila", "The Lahore Fort, also known as Shahi Qila, is a UNESCO World Heritage Site in Lahore, Pakistan. It spans over 20 hectares, houses 21 historical monuments, and was rebuilt during the Mughal era. Its iconic Alamgiri Gate faces the Badshahi Mosque.", R.drawable.lhr_shahi_qila))
        placesList.add(dataClass("◕ Badshahi Mosque", "The Badshahi Mosque, an iconic Mughal-era congregational mosque in Lahore, Pakistan, was built by Emperor Aurangzeb between 1671 and 1673. Its exterior features intricately carved red sandstone with marble inlay, making it a prime example of Mughal architecture.", R.drawable.lhr_badshahi_mosque))
        placesList.add(dataClass("◕ Minar-e-Pakistan:", "The Minar-e-Pakistan, a national monument in Lahore, was built where the All-India Muslim League passed the Lahore Resolution in 1940. It symbolizes the call for an independent homeland for Muslims. The tower’s blend of Mughal and modern architecture stands tall in Greater Iqbal Park, offering panoramic views to visitors.", R.drawable.lhr_minar_e_pak))
        placesList.add(dataClass("◕ Lahore Museum", "The Lahore Museum, established in 1865, houses a rich collection of Buddhist art, artifacts from the Indus Valley Civilization, and remnants of the Mughal and British Indian Empires. It stands as a cultural testament in Lahore, blending Mughal architecture with British colonial style . ", R.drawable.lhr_museum))
        placesList.add(dataClass("◕ Lahore’s Food Street ", "Lahore’s Food Street offers a vibrant array of flavors, from spicy Punjabi dishes to delightful street snacks like golgappas and jalebi. It’s a must-visit for food enthusiasts seeking an authentic taste of Pakistan’s culinary heritage.", R.drawable.lhr_street_food))

        recyclerView = findViewById(R.id.recyclerView_lahore)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = Adapter(placesList)
        recyclerView.adapter = adapter
    }
    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
    }
}