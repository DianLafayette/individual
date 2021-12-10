package com.example.individual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.individual.databinding.ActivityLanguageBinding
import com.example.individual.databinding.ActivityLorrBinding

class LorRActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLorrBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lorr)

        binding= ActivityLorrBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.register.setOnClickListener {
            startActivity(Intent(this,RegActivity::class.java))}

        binding.goLogin.setOnClickListener {
            startActivity(Intent(this,RegActivity::class.java))}

    }}