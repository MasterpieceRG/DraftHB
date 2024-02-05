package com.example.presentationproject.Retrofit

import com.example.presentationproject.Meals.MealList
import retrofit2.Call
import retrofit2.http.GET

interface MealApi {
    @GET("random.php")
    fun getRandomMeal():Call<MealList>
}