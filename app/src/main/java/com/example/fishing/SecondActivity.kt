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
        val putKnowledgeTitle = findViewById<TextView>(R.id.fishKnowledgeTitle)
        val putKnowledgeInfo = findViewById<TextView>(R.id.fishKnowledgeInfo)
        val putFishingTitle = findViewById<TextView>(R.id.fishFishingTitle)
        val putFishSpringTitle = findViewById<TextView>(R.id.fishSpringTitle)
        val putFishSpringInfo = findViewById<TextView>(R.id.fishSpringInfo)
        val putFishSummerTitle = findViewById<TextView>(R.id.fishSummerTitle)
        val putFishSummerInfo = findViewById<TextView>(R.id.fishSummerInfo)
        val putFishFallTitle = findViewById<TextView>(R.id.fishFallTitle)
        val putFishFallInfo = findViewById<TextView>(R.id.fishFallInfo)
        val putFishWinterTitle = findViewById<TextView>(R.id.fishWinterTitle)
        val putFishWinterInfo = findViewById<TextView>(R.id.fishWinterInfo)
        val putFishEquipmentTitle = findViewById<TextView>(R.id.fishEquipmentTitle)
        val putFishEquipmentInfo = findViewById<TextView>(R.id.fishEquipmentInfo)
        val putFishWarningsTitle = findViewById<TextView>(R.id.fishWarningsTitle)
        val putFishWarningsInfo = findViewById<TextView>(R.id.fishWarningsInfo)



        val fishIntent = intent
        val fishName = fishIntent.getStringExtra("title").toString()
        val fishImageReal = fishIntent.getStringExtra("imageReal")
        val fishImageMap = fishIntent.getStringExtra("imageMap")
        val fishKnowledgeTitle = fishIntent.getStringExtra("generalKnowledgeTitle").toString()
        val fishKnowledgeInfo = fishIntent.getStringExtra("generalKnowledgeInfo").toString()
        val fishingTitle = fishIntent.getStringExtra("fishingTitle").toString()
        val springTitle = fishIntent.getStringExtra("springTitle").toString()
        val springInfo = fishIntent.getStringExtra("springInfo").toString()
        val summerTitle = fishIntent.getStringExtra("summerTitle").toString()
        val summerInfo = fishIntent.getStringExtra("summerInfo").toString()
        val fallTitle = fishIntent.getStringExtra("fallTitle").toString()
        val fallInfo = fishIntent.getStringExtra("fallInfo").toString()
        val winterTitle = fishIntent.getStringExtra("winterTitle").toString()
        val winterInfo = fishIntent.getStringExtra("winterInfo").toString()
        val equipmentTitle = fishIntent.getStringExtra("equipmentTitle").toString()
        val equipmentInfo = fishIntent.getStringExtra("equipmentInfo").toString()
        val warningsTitle = fishIntent.getStringExtra("warningsTitle").toString()
        val warningsInfo = fishIntent.getStringExtra("warningsInfo").toString()




        putFishName.text = fishName
        putKnowledgeTitle.text = fishKnowledgeTitle
        putKnowledgeInfo.text = fishKnowledgeInfo
        putFishingTitle.text  = fishingTitle
        putFishSpringTitle.text = springTitle
        putFishSpringInfo.text = springInfo
        putFishSummerTitle.text = summerTitle
        putFishSummerInfo.text = summerInfo
        putFishFallTitle.text = fallTitle
        putFishFallInfo.text = fallInfo
        putFishWinterTitle.text = winterTitle
        putFishWinterInfo.text = winterInfo
        putFishEquipmentTitle.text =  equipmentTitle
        putFishEquipmentInfo.text = equipmentInfo
        putFishWarningsTitle.text = warningsTitle
        putFishWarningsInfo.text = warningsInfo




        putFishImage.loadImage(fishImageReal, getProgressDrawable(this))
        putFishImageMap.loadImage(fishImageMap, getProgressDrawable(this))

    }
}