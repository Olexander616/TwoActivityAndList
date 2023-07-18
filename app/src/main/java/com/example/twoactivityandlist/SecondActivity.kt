package com.example.twoactivityandlist

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val key_number = intent.extras?.getInt("key_number") ?: -1
        val textView = findViewById<TextView>(R.id.textView)
        val key_string = intent.extras?.getString("key_string") ?: ""
        textView.text = "$key_string \n  ${key_number.toString()}"
    }
}