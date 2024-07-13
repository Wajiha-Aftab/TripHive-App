package com.example.triphive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class islamabad : AppCompatActivity() {

    companion object {
        val placesList = ArrayList<dataClass>()
    }

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_islamabad)

        placesList.add(dataClass("◕ Faisal Mosque", "The Faisal Mosque in Islamabad, designed by Turkish architect Vedat Dalokay, features a unique Bedouin tent-like design and can hold 300,000 people. Named after Saudi King Faisal, it spans 130,000 square meters and is a significant example of modern Islamic architecture.", R.drawable.isl_faisal_masjid))
        placesList.add(dataClass("◕ Pakistan Monument", "The Pakistan Monument in Islamabad symbolizes the unity of Pakistan's diverse cultures with its design of four large petals representing the main cultures and three smaller petals for minorities, Azad Kashmir, and Gilgit-Baltistan. Inspired by Mughal architecture, it is a popular tourist destination visible across the Islamabad-Rawalpindi area.", R.drawable.isl_monument))
        placesList.add(dataClass("◕ Daman-e-Koh", "Daman-e-Koh is a scenic viewpoint located in the heart of the Margalla Hills, north of Islamabad. It’s a fusion of two Persian words meaning ‘foothills’ and stands approximately 2400 feet above sea level, offering a spectacular panoramic view of the city.", R.drawable.isl_daman_e_koh))
        placesList.add(dataClass("◕ Lok Virsa Museum", "The Lok Virsa Museum in Islamabad is a hub for Pakistan’s cultural heritage, displaying traditional arts, crafts, and costumes, and offering educational events to promote the nation’s rich traditions and folklore.", R.drawable.isl_lok_virsa))
        placesList.add(dataClass("◕ Margalla Hills", "The Margalla Hills are a scenic range in Islamabad, Pakistan, known for their rich biodiversity and historical sites like the ancient Shah Allah Ditta Caves. They are part of the Himalayan foothills and are protected as a national park.", R.drawable.isl_margalla_hills))

        recyclerView = findViewById(R.id.recyclerView_isl)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = Adapter(placesList)
        recyclerView.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
    }
}