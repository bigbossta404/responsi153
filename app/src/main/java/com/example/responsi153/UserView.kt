package com.example.responsi153

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_view.*

class UserView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_view)

        val bundle: Bundle? = intent.extras
        val user = bundle?.get("username")
        val nama = bundle?.get("nama")
        val email = bundle?.get("email")

        show_username.setText(""+user)
        show_nama.setText(""+nama)
        show_email.setText(""+email)

        tombolbalik.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
