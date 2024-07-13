package com.example.triphive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class kallar_kahar : AppCompatActivity() {

    companion object {
        val placesList = ArrayList<dataClass>()
    }

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kallar_kahar)
        placesList.add(dataClass("◕ Hunza Valley", "This breathtaking valley is surrounded by serene landscapes, cherry blossoms, and pristine beauty. It’s a paradise for nature enthusiasts and photographers. You can explore magical villages, interact with hospitable locals, and enjoy the freshest apricots in the valley.", R.drawable.hunza_valley))
        placesList.add(dataClass("◕ Altit Fort", "Located in the Hunza Valley, Altit Fort is a historic architectural gem dating back over 900 years. Perched on a rocky hilltop overlooking the Hunza River, this ancient fort stands as a testament to the region’s rich cultural heritage and strategic importance along the historic Silk Road. With stunning views of the surrounding valley and mountains, Altit Fort remains a popular attraction for tourists and history enthusiasts alike.", R.drawable.hunza_altit_fort))
        placesList.add(dataClass("◕ Hussaini Hanging Bridge", "The Hussaini Hanging Bridge in Pakistan is renowned for its treacherous passage over Borit Lake, connecting Hussaini and Zarabad. Known as one of the world’s most dangerous bridges, it draws thrill-seekers with its missing planks and rope construction.", R.drawable.hussaini_hanging_bridge))
        placesList.add(dataClass("◕ Attabad Lake", "Attabad Lake is a lake located in the Gojal region of Gilgit-Baltistan, Pakistan. It was formed in January 2010 due to a significant landslide in Attabad. The lake offers a diverse range of activities, from boating, jet-skiing, and fishing to various winter sports, attracting attention year-round", R.drawable.hunza_attabad_lake))
        placesList.add(dataClass("◕ Passu Glacier", "The Passu Glacier is a striking feature of the Hunza Valley in Gilgit-Baltistan, Pakistan, known for its breathtaking blue ice and rugged mountain backdrop. It’s a major tributary to the Batura Glacier, extending about 19 kilometers in length", R.drawable.hunza_passu_glacier))

        recyclerView = findViewById(R.id.recyclerView_kallar_kahar)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = Adapter(placesList)
        recyclerView.adapter = adapter
    }
    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
    }
}