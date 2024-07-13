package com.example.triphive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.SearchView
import com.google.android.material.imageview.ShapeableImageView

class HomePage : AppCompatActivity() {

    private lateinit var btn_back: AppCompatButton
    private lateinit var btn_rateUs: AppCompatButton
    private lateinit var isl_btn: ShapeableImageView
    private lateinit var lahore_btn: ShapeableImageView
    private lateinit var hunza_btn: ShapeableImageView
    private lateinit var karachi_btn: ShapeableImageView
    private lateinit var naran_btn: ShapeableImageView
    private lateinit var kallarKahar_btn: ShapeableImageView
    private lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        // Initialize views
        btn_back = findViewById(R.id.backButton)
        btn_rateUs = findViewById(R.id.button_Rate)
        isl_btn = findViewById(R.id.islamabad_imageButton)
        lahore_btn = findViewById(R.id.Lahore_imageButton)
        hunza_btn = findViewById(R.id.hunza_imageButton)
        karachi_btn = findViewById(R.id.karachi_imageButton)
        naran_btn = findViewById(R.id.naran_kaghan_imageButton)
        kallarKahar_btn = findViewById(R.id.kallarKahar_ImageButton)
        searchView = findViewById(R.id.searchView)

        setupButtonListeners()
        setupSearchView()
    }

    private fun setupButtonListeners() {
        btn_back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btn_rateUs.setOnClickListener {
            val rateUsFragment = RateUsFragment()
            rateUsFragment.show(supportFragmentManager, "rateUsFragment")
        }

        isl_btn.setOnClickListener {
            val intent = Intent(this, islamabad::class.java)
            startActivity(intent)
        }

        lahore_btn.setOnClickListener {
            val intent = Intent(this, lahore::class.java)
            startActivity(intent)
        }

        hunza_btn.setOnClickListener {
            val intent = Intent(this, hunza::class.java)
            startActivity(intent)
        }

        karachi_btn.setOnClickListener {
            val intent = Intent(this, karachi::class.java)
            startActivity(intent)
        }

        naran_btn.setOnClickListener {
            val intent = Intent(this, naran_kaghan::class.java)
            startActivity(intent)
        }

        kallarKahar_btn.setOnClickListener {
            val intent = Intent(this, kallar_kahar::class.java)
            startActivity(intent)
        }
    }

    private fun setupSearchView() {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                query?.let {
                    searchDestination(it)
                }
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                newText?.let {
                    searchDestination(it)
                }
                return true
            }
        })
    }

    private fun searchDestination(query: String) {
        val trimmedQuery = query.trim()

        val destinations = mapOf(
            "islamabad" to Pair(isl_btn, findViewById<TextView>(R.id.isl_TextView)),
            "lahore" to Pair(lahore_btn, findViewById<TextView>(R.id.lahore_TextView)),
            "hunza" to Pair(hunza_btn, findViewById<TextView>(R.id.hunza_TextView)),
            "karachi" to Pair(karachi_btn, findViewById<TextView>(R.id.karachi_TextView)),
            "naran kaghan" to Pair(naran_btn, findViewById<TextView>(R.id.Naran_kaghan_TextView)),
            "kallar kahar" to Pair(kallarKahar_btn, findViewById<TextView>(R.id.kallarKahar_TextView))
        )

        destinations.forEach { (key, pair) ->
            val (imageButton, textView) = pair
            if (key.contains(trimmedQuery, ignoreCase = true)) {
                imageButton.visibility = View.VISIBLE
                textView.visibility = View.VISIBLE
            } else {
                imageButton.visibility = View.GONE
                textView.visibility = View.GONE
            }
        }
    }
}
