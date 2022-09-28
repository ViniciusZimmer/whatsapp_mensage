package br.aztek.whatsapp_clone

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val phoneNumber : EditText = findViewById(R.id.phoneNumber)
        val message : EditText = findViewById(R.id.message)
        val btn : ImageButton = findViewById(R.id.sendButton)

        btn.setOnClickListener {
            val number = phoneNumber.text.toString()
            val msg = message.text.toString()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://api.whatsapp.com/send?phone=$number&text=$msg")
            startActivity(intent)
        }

    }
}