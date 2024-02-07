package com.example.presentationproject.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.presentationproject.R
import com.example.presentationproject.databinding.ActivityCategoriesBinding

class ActivityCategories : AppCompatActivity() {
    private lateinit var binding: ActivityCategoriesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}