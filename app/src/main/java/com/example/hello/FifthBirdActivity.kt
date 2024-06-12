package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.hello.databinding.ActivityFifthBirdBinding
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnPrev4.setOnClickListener {
            finish()
        }
        Picasso.get()
            .load("https://i.pinimg.com/474x/4e/8d/8f/4e8d8f2091315fdc8cf4509814bd4a2f.jpg")
            .into(binding.imageView11)

    }
}
