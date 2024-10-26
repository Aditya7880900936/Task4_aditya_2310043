package com.example.watersaver

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class corausel1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_corausel1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.coarausel1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn : Button = findViewById<Button>(R.id.btn1)
        btn.setOnClickListener{
            val intent = Intent(this@corausel1, corausel2::class.java)
            startActivity(intent)
            finish()
        }
    }
}