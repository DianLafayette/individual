package com.example.individual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.individual.databinding.ActivityLorrBinding
import com.example.individual.databinding.ActivityThanksBinding

class thanksActivity : AppCompatActivity() {
    private lateinit var binding:ActivityThanksBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thanks)


        binding= ActivityThanksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.close.setOnClickListener {
            startActivity(Intent(this,MainmenuActivity::class.java))}

    }
}