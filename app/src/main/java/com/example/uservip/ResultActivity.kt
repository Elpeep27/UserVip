package com.example.uservip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewbinding.ViewBinding
import com.example.uservip.UserVipApplication.Companion.prefs
import com.example.uservip.databinding.ActivityMainBinding
import com.example.uservip.databinding.ActivityResultBinding


class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()

    }
    fun initUI(){

      binding.btnBack.setOnClickListener{
          prefs.wipe()
          onBackPressed()
      }
        val userName = prefs.getName()
        binding.tvName.text = "Bienvenido $userName"
        if(prefs.getVip()){

            setVIPColorBackground()
        }


        }


        fun setVIPColorBackground() {
            binding.container.setBackgroundColor(ContextCompat.getColor(this,R.color.rose))

    }
}

