package com.example.individual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.individual.databinding.ActivityIntroBinding
import com.example.individual.databinding.ActivityLanguageBinding

class LanguageActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLanguageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        binding= ActivityLanguageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.russian.setOnClickListener {
            startActivity(Intent(this,RegActivity::class.java))}}}
