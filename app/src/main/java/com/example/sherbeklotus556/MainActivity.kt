package com.example.sherbeklotus556

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sherbeklotus556.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}