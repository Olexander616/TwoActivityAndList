package com.example.twoactivityandlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import java.lang.invoke.ConstantCallSite

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ConstraintLayout : ConstraintLayout = findViewById(R.id.fon)
        ConstraintLayout.setOnClickListener{
            val bundle =Bundle()
            bundle.putInt("key_number",3)

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtras(bundle)
            intent.putExtra("key_string", "Hello second activity")
            //intent.putExtra("key_number", 3)
            startActivity(intent)

        }
    }
}