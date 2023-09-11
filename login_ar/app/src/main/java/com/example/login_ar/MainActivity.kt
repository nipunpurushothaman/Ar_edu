package com.example.login_ar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val brain3 =findViewById<Button>(R.id.brain1)
        brain3.setOnClickListener{
            val intent1 =Intent(this,brain1activity::class.java)
            startActivity(intent1)

        }
        val heart4 =findViewById<Button>(R.id.heart1)
        heart4.setOnClickListener {
            val intent2 = Intent(this,heart1activity::class.java)
            startActivity(intent2)
        }
        val digestion4 =findViewById<Button>(R.id.digestion1)
        digestion4.setOnClickListener {
            val intent3 = Intent(this,digestion1activity::class.java)
            startActivity(intent3)
        }
        val kidney2 =findViewById<Button>(R.id.kidney1)
        kidney2.setOnClickListener {
            val intent4 = Intent(this,kidney1activity::class.java)
            startActivity(intent4)
        }
        val eye5 =findViewById<Button>(R.id.eye1)
        eye5.setOnClickListener {
            val intent5 = Intent(this,eye1activity::class.java)
            startActivity(intent5)
        }
        val lungs6 =findViewById<Button>(R.id.lungs1)
        lungs6.setOnClickListener {
            val intent6 = Intent(this,lungs1activity::class.java)
            startActivity(intent6)
        }
        val urinary6 =findViewById<Button>(R.id.urinary1)
        urinary6.setOnClickListener {
            val intent7 = Intent(this,urinary1activity::class.java)
            startActivity(intent7)
        }
        val skull8 =findViewById<Button>(R.id.skull1)
        skull8.setOnClickListener {
            val intent8 = Intent(this,skull1activity::class.java)
            startActivity(intent8)
        }
    }
}