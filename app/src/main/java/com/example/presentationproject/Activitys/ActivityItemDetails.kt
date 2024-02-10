package com.example.presentationproject.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.presentationproject.databinding.ActivityItemDetailsBinding

class ActivityItemDetails : AppCompatActivity() {
    private lateinit var binding: ActivityItemDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityItemDetailsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.image.setImageResource(intent.getIntExtra("image", 0))
        binding.name.text = intent.getStringExtra("name")
        binding.price.text = intent.getStringExtra("price")
        binding.category.text = intent.getStringExtra("category")
        binding.time.text = intent.getStringExtra("time")
        binding.ingredient.setText(intent.getIntExtra("ingredient", 0))
        binding.details.setText(intent.getIntExtra("details", 0))


    }
}