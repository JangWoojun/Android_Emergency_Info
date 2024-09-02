package com.seogaemo.android_emergency_info

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.seogaemo.android_emergency_info.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}