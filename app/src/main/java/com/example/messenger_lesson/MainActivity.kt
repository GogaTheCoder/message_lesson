package com.example.messenger_lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSendMessage: Button = findViewById(R.id.buttonSendMessage)
        val editTextMessage: EditText = findViewById(R.id.editTextMessage)

        buttonSendMessage.setOnClickListener{ view ->
            // Do something when the button is clicked
            val message: String = editTextMessage.text.toString()
            launchedNextScreen(message)
        }

    }

    private fun launchedNextScreen(message: String){
        val intent = Intent(this, ReceivedMessageActivity::class.java)
//        val textView: TextView = findViewById(R.id.textView2)
//        textView.text = message
        intent.putExtra("message", message)
        startActivity(intent)

    }
}