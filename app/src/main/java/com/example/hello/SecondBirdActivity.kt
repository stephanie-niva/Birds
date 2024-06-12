package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPrev1.setOnClickListener {
            finish()
        }

        binding.btnNext2.setOnClickListener{
            val intent = Intent(this,ThirdBirdActivity ::class.java)
            startActivity(intent)


        }
        Picasso.get()
               .load("https://i.pinimg.com/474x/28/b6/b4/28b6b46abe6e3adfd6a6b5bc17ebbc47.jpg")
               .into(binding.imageView2)

    }
}

