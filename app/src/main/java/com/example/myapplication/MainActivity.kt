package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val txt = findViewById<TextView>(R.id.text2)
        val etxt = findViewById<EditText>(R.id.editText)

        btn.setOnClickListener {
            if (etxt.text.toString() == "") {
                Toast.makeText(this, "Can not be empty!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, NextActivity::class.java)
                intent.putExtra("key", etxt.text.toString())
                startActivity(intent)
            }
        }

        val myText: String = intent.getStringExtra("key2").toString()
        txt.text = myText

    }
}