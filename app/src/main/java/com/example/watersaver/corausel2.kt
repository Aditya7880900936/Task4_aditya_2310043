package com.example.watersaver

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.watersaver.corausel1

class corausel2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_corausel2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.coarausel2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn : Button = findViewById<Button>(R.id.btn2)
        btn.setOnClickListener{
            val intent = Intent(this@corausel2, corausel3::class.java)
            startActivity(intent)
            finish()
        }
    }
}