package com.example.uservip

import android.app.Application

class UserVipApplication: Application() {

    companion object{
        lateinit var prefs: Prefs
    }

    override fun onCreate() {
        super.onCreate()
        val prefs = Prefs(applicationContext)
    }
}