package com.example.fishing
import android.icu.text.CaseMap

class FishData{
    var title:String? = null
    var image:String? = null
    var imageReal:String? = null
    var imageMap: String? = null
    var generalKnowledgeTitle: String? = null
    var generalKnowledgeInfo: String? = null
    var fishingTitle: String? = null
    var springTitle: String? = null
    var springInfo: String? = null
    var summerTitle:String? = null
    var summerInfo: String? = null
    var fallTitle: String? = null
    var fallInfo: String? = null
    var winterInfo: String? = null
    var winterTitle: String? = null
    var equipmentTitle: String? = null
    var equipmentInfo: String? = null
    var warningsTitle: String? = null
    var warningsInfo: String? = null


    constructor(){}

    constructor(
        title: String?,
        image: String?,
        imageReal: String?,
        imageMap: String?,
        generalKnowledgeInfo: String?,
        generalKnowledgeTitle: String?,
        fishingTitle: String?,
        springTitle: String?,
        springInfo: String?,
        summerTitle: String?,
        summerInfo: String?,
        fallTitle:String?,
        fallInfo:String?,
        winterTitle:String?,
        winterInfo:String?,
        equipmentInfo: String?,
        equipmentTitle: String?,
        warningsTitle:String?,
        warningsInfo:String?,
    ){
        this.title = title
        this.image = image
        this.imageMap = imageMap
        this.imageReal = imageReal
        this.generalKnowledgeInfo = generalKnowledgeInfo
        this.generalKnowledgeTitle = generalKnowledgeTitle
        this.fishingTitle = fishingTitle
        this.springTitle = springTitle
        this.springInfo = springInfo
        this.summerTitle = summerTitle
        this.summerInfo = summerInfo
        this.fallTitle = fallTitle
        this.fallInfo = fallInfo
        this.winterTitle = winterTitle
        this.winterInfo = winterInfo
        this.equipmentInfo = equipmentInfo
        this.equipmentTitle = equipmentTitle
        this.warningsInfo = warningsInfo
        this.warningsTitle = warningsTitle

    }
}



