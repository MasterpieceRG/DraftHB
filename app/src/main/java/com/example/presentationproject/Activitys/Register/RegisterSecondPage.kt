package com.example.presentationproject.Activitys.Register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.presentationproject.Activitys.MainActivity
import com.example.presentationproject.R
import com.example.presentationproject.databinding.ActivityRegisterSecondPageBinding

class RegisterSecondPage : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterSecondPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterSecondPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerBtn.setOnClickListener {
            startActivity(Intent(this@RegisterSecondPage, MainActivity::class.java))
        }
    }
}