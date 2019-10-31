package com.example.responsi153

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var user: EditText = findViewById(R.id.username)
        var nama: EditText = findViewById(R.id.nama)
        var email: EditText = findViewById(R.id.email)


        btnregister.setOnClickListener() {
            intent = Intent(this, UserView::class.java)
            intent.putExtra("username",user.getText())
            intent.putExtra("nama",nama.getText())
            intent.putExtra("email",email.getText())
            startActivity(intent)
        }
    }
}
