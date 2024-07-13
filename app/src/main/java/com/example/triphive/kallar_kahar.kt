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
        placesList.add(dataClass("◕ Kata's Raj Fort", "The Katas Raj Temples in Pakistan are a complex of Hindu temples dedicated to Lord Shiva, with a history spanning over 1500 years. It’s a significant pilgrimage site and a testament to ancient heritage and faith.", R.drawable.kalr_katas_raj_fort))
        placesList.add(dataClass("◕ Malot Fort Kalar", "Malot Fort (ملوٹ قلعہ) is a temple-fortress located in Chakwal District, Punjab, Pakistan. It was built in the 10th century AD and exhibits a fascinating synthesis of Kashmiri and Greek architecture. Constructed by stonemasons from the Potohar plateau, it has preserved Greek architectural techniques across generations.", R.drawable.kalr_molatfort_kalar))
        placesList.add(dataClass("◕ Kallar Kahar Lake", "Kallar Kahar Lake , is a stunning artificial lake located just outside the city of Chakwal in Punjab Province, Pakistan. Formed by British engineer Sir Ganga Ram, it is one of the most significant reservoirs in Pakistan and has been designated as a protected area under the National Conservation Act of 1975. The lake offers boat rides, bird-watching, and picturesque views of the surrounding mountains. ", R.drawable.kallar_kaharlake))
        placesList.add(dataClass("◕ Swaik Lake", "Swaik Lake, also known as Khandowa Lake, is a hidden gem located approximately 10 kilometers from the Tehsil of Kallar Kahar in the Chakwal District of Pakistan. This picturesque lake offers crystal-clear water, cliff diving, swimming, and trekking opportunities. It’s a popular destination for both Pakistani and foreign tourists, and it’s also recognized as one of Asia’s largest bird sanctuaries, hosting over 200 species of birds.", R.drawable.kalr_swaiklake))
        placesList.add(dataClass("◕ Takhtai Babri", "Takht-e-Babri, located in Kallar Kahar, Punjab, Pakistan, is a small black monument with a staircase leading to a platform. Constructed by Babur, the founder of the Mughal Empire, it holds historical significance as the first Mughal construction in India.", R.drawable.kalr_takhtaibabri))

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