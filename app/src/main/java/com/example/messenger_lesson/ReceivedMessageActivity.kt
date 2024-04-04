package com.example.messenger_lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ReceivedMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_received_message)

        val intent: Intent = intent
        val message: String? = intent.getStringExtra("message")
        val textView: TextView = findViewById(R.id.textView2)
        textView.text = message

    }
}