package com.example.triphive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.google.android.material.imageview.ShapeableImageView

class HomePage : AppCompatActivity() {

    private lateinit var btn_back : ImageButton
    private lateinit var isl_btn : ShapeableImageView
    private lateinit var lahore_btn : ShapeableImageView
    private lateinit var hunza_btn : ShapeableImageView
    private lateinit var karachi_btn : ShapeableImageView
    private lateinit var naran_btn : ShapeableImageView
    private lateinit var kallarKahar_btn : ShapeableImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        btn_back = findViewById(R.id.backButton)
        isl_btn = findViewById(R.id.islamabad_imageButton)
        lahore_btn = findViewById(R.id.Lahore_imageButton)
        hunza_btn = findViewById(R.id.hunza_imageButton)
        karachi_btn = findViewById(R.id.karachi_imageButton)
        naran_btn = findViewById(R.id.naran_kaghan_imageButton)
        kallarKahar_btn = findViewById(R.id.kallarKahar_ImageButton)

        btn_back.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        isl_btn.setOnClickListener{
            val intent = Intent(this,islamabad::class.java)
            startActivity(intent)
        }
        lahore_btn.setOnClickListener{
            val intent = Intent(this,lahore::class.java)
            startActivity(intent)
        }

        hunza_btn.setOnClickListener{
            val intent = Intent(this,hunza::class.java)
            startActivity(intent)
        }
        karachi_btn.setOnClickListener{
            val intent = Intent(this,karachi::class.java)
            startActivity(intent)
        }
        naran_btn.setOnClickListener{
            val intent = Intent(this,naran_kaghan::class.java)
            startActivity(intent)
        }
        kallarKahar_btn.setOnClickListener{
            val intent = Intent(this,kallar_kahar::class.java)
            startActivity(intent)
        }
    }
}