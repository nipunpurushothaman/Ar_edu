package com.example.login_ar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class heart1activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heart1activity)
        val back1 =findViewById<Button>(R.id.back_button)
        back1.setOnClickListener{
            val intent5 = Intent(this,MainActivity::class.java)
            startActivity(intent5)
        }
        val arhe =findViewById<Button>(R.id.ar_button)
        arhe.setOnClickListener{
            val intent5 = Intent(this,Heart::class.java)
            startActivity(intent5)
        }
    }
}