package com.example.login_ar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class brain1activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brain1activity)
        val back1 =findViewById<Button>(R.id.back_button)
        back1.setOnClickListener{
            val intent5 = Intent(this,MainActivity::class.java)
            startActivity(intent5)
        }
        val arbr =findViewById<Button>(R.id.ar_button)
        arbr.setOnClickListener{
            val intent5 = Intent(this,Brain::class.java)
            startActivity(intent5)
        }
    }
}