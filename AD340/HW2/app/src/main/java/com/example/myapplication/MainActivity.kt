package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val butt = findViewById<Button>(R.id.button)

        butt.setOnClickListener {
            Toast.makeText(this,"Sent!", Toast.LENGTH_SHORT).show()
        }

        val butt2 = findViewById<Button>(R.id.button2)

        butt2.setOnClickListener {
            Toast.makeText(this,"Opening Menu", Toast.LENGTH_SHORT).show()
        }

        val butt3 = findViewById<Button>(R.id.button3)

        butt3.setOnClickListener {
            Toast.makeText(this,"Creating New", Toast.LENGTH_SHORT).show()
        }

        val butt4 = findViewById<Button>(R.id.button4)

        butt4.setOnClickListener {
            Toast.makeText(this,"Getting Help!", Toast.LENGTH_SHORT).show()
        }

        val butt5 = findViewById<Button>(R.id.button5)

        butt5.setOnClickListener {
            Toast.makeText(this,"Reset Complete", Toast.LENGTH_SHORT).show()
        }




    }
}


