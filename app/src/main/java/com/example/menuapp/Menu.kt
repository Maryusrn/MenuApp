package com.example.menuapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.snackbar.Snackbar

private lateinit var btn1:AppCompatButton
private lateinit var btn2:AppCompatButton
private lateinit var btn3:AppCompatButton
private lateinit var btn4:AppCompatButton
private lateinit var btn5:AppCompatButton
private var muestratexto: Boolean = false
private lateinit var tvbtn5: TextView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        initComponents()
        initListeners()
    }

    private fun initListeners() {
        btn1.setOnClickListener {
            btn1page()
        }
        btn2.setOnClickListener {
            val toast = Toast.makeText(this, "Toast de Botón 2", Toast.LENGTH_SHORT)
            toast.show()
        }
        btn3.setOnClickListener {
            Snackbar.make(btn3, "Hola este es el Snackbar del Botón 3!", Snackbar.LENGTH_SHORT)
                .show()
        }
        btn4.setOnClickListener {
            btn4close()
        }
        btn5.setOnClickListener {
            btn5Muestra()
        }
    }

    private fun initComponents() {
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        tvbtn5 = findViewById(R.id.tvbtn5)
    }

    private fun btn1page(){
        val intent = Intent(this, btn1activity::class.java)
        startActivity(intent)
    }
    private fun btn4close(){
        finishAffinity()
    }

    private fun btn5Muestra(){
        muestratexto = !muestratexto
        when{
            !muestratexto -> {
                tvbtn5.text = "Este es el texto del Botón 5"
            }
            muestratexto -> {
                tvbtn5.text = ""
            }
        }
    }
}