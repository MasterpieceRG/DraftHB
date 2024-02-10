package com.example.presentationproject.Activitys.Starting

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.presentationproject.Activitys.Register.SignInPage
import com.example.presentationproject.databinding.ActivityGetStartBinding

class GetStart : AppCompatActivity() {
    private lateinit var binding: ActivityGetStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityGetStartBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val width = binding.textLogo.paint.measureText(binding.textLogo.text.toString())
        binding.textLogo.paint.shader = LinearGradient(
            0f, 0f, width, binding.textLogo.textSize, intArrayOf(
                Color.parseColor("#FC7114"),
                Color.parseColor("#FEC919")
            ), null, Shader.TileMode.REPEAT
        )

        binding.getStart.setOnClickListener {
            startActivity(Intent(this@GetStart, SignInPage::class.java))
        }


    }
}