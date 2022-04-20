package com.example.fishing

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val putFishName = findViewById<TextView>(R.id.fishName)
        val putFishImage = findViewById<ImageView>(R.id.fishImageReal)
        val putFishImageMap = findViewById<ImageView>(R.id.fishImageMap)

        val fishIntent = intent
        val fishName = fishIntent.getStringExtra("title").toString()
        val fishImageReal = fishIntent.getStringExtra("imageReal")
        val fishImageMap = fishIntent.getStringExtra("imageMap")

        putFishName.text = fishName
        putFishImage.loadImage(fishImageReal, getProgressDrawable(this))
        putFishImageMap.loadImage(fishImageMap, getProgressDrawable(this))

    }
}