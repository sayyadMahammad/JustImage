package com.example.justimagesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstImage = findViewById<ImageView>(R.id.imageViewid)
        firstImage.setImageResource(R.drawable.atlanta)

    }
}