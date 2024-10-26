package com.example.watersaver

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.watersaver.corausel2

class corausel3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_corausel3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.coarausel3)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn : Button = findViewById<Button>(R.id.btn3)
        btn.setOnClickListener{
            val intent = Intent(this@corausel3, mainLooper::class.java)
            startActivity(intent)
            finish()
        }
    }
}