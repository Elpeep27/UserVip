 package com.example.uservip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.uservip.UserVipApplication.Companion.prefs
import com.example.uservip.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)

         initUI()
         checkUserValues()
     }
     fun checkUserValues(){
         if(prefs.getName().isNotEmpty()){
             goTpDetail()
         }

     }

     fun initUI() {
         binding.btnContinue.setOnClickListener{accessToDetail()}


     }

         fun accessToDetail(){
         if(binding.etName.text.toString().isNotEmpty()){
             prefs.saveName(binding.etName.text.toString())
             prefs.saveVIP((binding.cbVip.isChecked))
             goTpDetail()
         } else{
             //Hacer otra cosa
         }
     }

     fun goTpDetail(){

         startActivity(Intent(this,ResultActivity::class.java))
     }

 }