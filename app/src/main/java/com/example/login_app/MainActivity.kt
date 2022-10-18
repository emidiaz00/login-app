package com.example.login_app


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLoginNow = findViewById<Button>(R.id.btn_loginNow)
        var inputEmptyUser = findViewById<EditText>(R.id.txt_username)
        var inputEmptyPassword = findViewById<EditText>(R.id.txt_password)
        var alreadyNotRegistered = findViewById<TextView>(R.id.txt_NotRegistered)

        buttonLoginNow.setOnClickListener {
            if (inputEmptyUser.text.toString().length == 0) {
                Toast.makeText(this, "Please enter username", Toast.LENGTH_SHORT).show();
            } else if (inputEmptyPassword.text.toString().length == 0) {
                Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            } else if (inputEmptyPassword.text.toString().length < 8) {
                Toast.makeText(this, "Please enter valid password", Toast.LENGTH_SHORT).show();
            } else {
                val intent = Intent(this, HelloActivity::class.java)
                startActivity(intent)
            }
        }




    }


}