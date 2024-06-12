package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPrev3.setOnClickListener {
            finish()
        }

        binding.btnNext4.setOnClickListener{
            val intent = Intent(this,FifthBirdActivity ::class.java)
            startActivity(intent)


        }
        Picasso.get()
            .load("https://i.pinimg.com/474x/39/a8/0b/39a80be8f2b67f4684181ac5cb05f301.jpg")
            .into(binding.imageView6)

    }
}


