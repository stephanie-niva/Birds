package com.example.hello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPrev2.setOnClickListener {
            finish()
        }

        binding.btnNext3.setOnClickListener{
            val intent = Intent(this, FourthBirdActivity::class.java)
            startActivity(intent)


        }
        Picasso.get()
            .load("https://i.pinimg.com/474x/fe/92/78/fe9278dfd2e9f075ec6b7e9afe5eadb1.jpg")
            .into(binding.imageView5)

    }
}