package com.example.presentationproject.AdapterMenu

import androidx.room.Entity
import androidx.room.PrimaryKey

data class MealTypes(
    var itemImage:Int,
    var itemName:String,
    var availablePan:String,
    var price:String,
    var ingredient:Int,
    var details:Int
)