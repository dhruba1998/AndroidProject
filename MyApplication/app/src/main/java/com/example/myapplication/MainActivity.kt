package com.example.myapplication


import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.busServiceButton).setOnClickListener {
            val intent = Intent(this, BusPassDetailsActivity::class.java)
            startActivity(intent)
        }
    }
}