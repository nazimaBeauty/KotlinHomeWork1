package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        val text = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button2)
        val hint = findViewById<EditText>(R.id.hintEdit)

        val myText: String = intent.getStringExtra("key").toString()
        text.text = myText
        hint.hint = myText
        button.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            if (hint.text.toString() != "") {
                intent2.putExtra("key2", hint.text.toString())
                startActivity(intent2)
            } else
                Toast.makeText(this, "Can not be empty!", Toast.LENGTH_SHORT).show()
        }
    }
}