package com.example.individual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.individual.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    private lateinit var binding:ActivityIntroBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logo.setOnClickListener {
            startActivity(Intent(this,LanguageActivity::class.java))
        }


    }
}

