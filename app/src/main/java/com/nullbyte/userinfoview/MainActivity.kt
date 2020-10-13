package com.nullbyte.userinfoview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userInfoView: UserInfoView = findViewById(R.id.info)
        userInfoView.loadImageFromUrl("https://i.dlpng.com/static/png/6750061_preview.png")
    }
}