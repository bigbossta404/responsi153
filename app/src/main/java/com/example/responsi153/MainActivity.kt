package com.example.responsi153

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linkdaftar.setOnClickListener() {
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }



     btn_login.setOnClickListener() {
         val username = username.text.toString()
         val password = password.text.toString()
//         val username = findViewById<EditText>(R.id.username)
//         val password = findViewById<EditText>(R.id.password)

         if (username.equals("admin") && password.equals("aingmaung")) {
             val intent = Intent(this, HomeActivity::class.java)
             startActivity(intent)
         } else {
             Toast.makeText(this, "Masukan yang benar", Toast.LENGTH_LONG).show()
         }
     }

    }
}
