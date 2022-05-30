package com.ktl1.fragmentnavigationanimationbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktl1.fragmentnavigationanimationbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}