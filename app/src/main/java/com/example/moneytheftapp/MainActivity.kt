package com.example.moneytheftapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton: Button = findViewById(R.id.submit_button)
        submitButton.setOnClickListener {
            val inputWho = findViewById<EditText>(R.id.input_who)
            val inputHowMuch = findViewById<EditText>(R.id.input_how_much)
            val inputHow = findViewById<EditText>(R.id.input_how)
            // add your code to save the input values
            val who = inputWho.text.toString().trim()
            val howMuch = inputHowMuch.text.toString().trim()
            val how = inputHow.text.toString().trim()
            // clear the input fields
            inputWho.setText("")
            inputHowMuch.setText("")
            inputHow.setText("")
            // test the input values were saved
            Log.d("TAG", "who: $who, how_much: $howMuch, how: $how")

        }
    }
}