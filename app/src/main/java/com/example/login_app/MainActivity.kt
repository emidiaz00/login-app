package com.example.login_app


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val buttonLoginHome = findViewById<Button>(R.id.btn_login)

        buttonLoginHome.setOnClickListener {
            val intent = Intent(this, HelloActivity::class.java)
            startActivity(intent)
        }

    }
}