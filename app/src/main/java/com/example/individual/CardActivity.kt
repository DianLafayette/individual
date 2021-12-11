package com.example.individual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.individual.databinding.ActivityCardBinding
import com.example.individual.databinding.ActivityPromoBinding

class CardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        binding = ActivityCardBinding.inflate(layoutInflater)
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