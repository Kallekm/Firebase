package com.example.fishing
import android.icu.text.CaseMap

class FishData{
    var title:String? = null
    var image:String? = null
    var imageReal:String? = null
    var imageMap: String? = null

    constructor(){}

    constructor(
        title: String?,
        image: String?,
        imageReal: String?,
        imageMap: String?,
    ){
        this.title = title
        this.image = image
        this.imageMap = imageMap
        this.imageReal = imageReal
    }
}



