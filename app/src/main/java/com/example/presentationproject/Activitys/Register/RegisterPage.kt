package com.example.presentationproject.Activitys.Register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.presentationproject.R
import com.example.presentationproject.databinding.ActivityRegisterPageBinding

class RegisterPage : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitBtn.setOnClickListener {
            startActivity(Intent(this@RegisterPage, RegisterSecondPage::class.java))
        }

        binding.signInLink.setOnClickListener {
            startActivity(Intent(this@RegisterPage, SignInPage::class.java))
        }
    }
}