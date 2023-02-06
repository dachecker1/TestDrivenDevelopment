package com.vk.testdrivendevelopment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vk.testdrivendevelopment.databinding.ActivityGameBinding

class CocktailsGameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}