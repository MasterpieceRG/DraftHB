package com.example.presentationproject.Activitys.Register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.presentationproject.Activitys.MainActivity
import com.example.presentationproject.databinding.ActivitySignInPageBinding

class SignInPage : AppCompatActivity() {
    private lateinit var binding: ActivitySignInPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerLink.setOnClickListener {
            startActivity(Intent(this@SignInPage, RegisterPage::class.java))
        }

        binding.signinBtn.setOnClickListener {
            startActivity(Intent(this@SignInPage, MainActivity::class.java))
        }
    }
}