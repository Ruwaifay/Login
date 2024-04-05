package com.example.task1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        supportActionBar?.title="Activity 1"
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun openMain(view : View){
        val intent= Intent ( this, HomeScreen::class.java)
        startActivity(intent)
    }

    fun openMain2(view : View){
        val intent= Intent ( this, Signup::class.java)
        startActivity(intent)}
    fun openMain5(view : View){
        val intent= Intent ( this, Reset::class.java)
        startActivity(intent)}




}