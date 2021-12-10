package com.example.individual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.individual.databinding.ActivityCardBinding
import com.example.individual.databinding.ActivityLorrBinding
import com.example.individual.databinding.ActivityMainmenuBinding
import com.example.individual.databinding.ActivityPromoBinding

class MainmenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainmenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmenu)


        binding = ActivityMainmenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goMainmenu.setOnClickListener {
            startActivity(Intent(this, MainmenuActivity::class.java))
        }

        binding.goPromo.setOnClickListener {
            startActivity(Intent(this, ActivityPromoBinding::class.java))
        }


        binding.goCard.setOnClickListener {
            startActivity(Intent(this, ActivityCardBinding::class.java))
        }



    }
}