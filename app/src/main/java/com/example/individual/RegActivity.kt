package com.example.individual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.individual.databinding.ActivityRegBinding

class RegActivity : AppCompatActivity() {

    private lateinit var binding:ActivityRegBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        binding= ActivityRegBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.endReg.setOnClickListener {
            startActivity(Intent(this,MainMenuActivity::class.java))}}}