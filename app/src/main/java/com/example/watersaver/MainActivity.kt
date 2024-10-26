package com.example.watersaver

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge for the window
        enableEdgeToEdge()

        // Show splash screen
        val splashScreen = installSplashScreen()

        // Optional: Keep the splash screen displayed for a while
        Thread.sleep(1000) // Use caution with this; it may cause UI blocking

        // Set the content view for the activity
        setContentView(R.layout.activity_main)

        // Apply window insets for proper padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.back_arrow)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the back arrow ImageView
        val backButton: ImageView = findViewById<ImageView>(R.id.back_arrow)

        // Set up the click listener for the back button
        backButton.setOnClickListener {
            // Create an Intent to start the carousel activity
            val intent = Intent(this@MainActivity, corausel1::class.java)
            startActivity(intent)
             // Finish the current activity if you don't want to return to it
        }
    }
}
