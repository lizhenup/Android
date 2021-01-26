package com.example.broadcastbestpractice

import android.content.Intent
import android.os.Bundle
import com.example.broadcastbestpractice.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        activityMainBinding.forceOffline.setOnClickListener {
            val intent = Intent("com.example.broadcastbestpractice.FORCE_OFFLINE")
            sendBroadcast(intent)//发送广播
        }
    }
}