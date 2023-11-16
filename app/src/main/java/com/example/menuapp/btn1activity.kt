package com.example.menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

private lateinit var btnvolver: AppCompatButton

class btn1activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btn1activity)
        initComponents()
        initListeners()
    }

    private fun initListeners() {
        btnvolver.setOnClickListener {
            btnvolver()
        }
    }

    private fun initComponents() {
        btnvolver = findViewById(R.id.btnvolver)
    }

    private fun btnvolver(){
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }
}