package com.example.list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

const val First_Item = "This is first item"
const val Second_Item = "This is second item"
const val Third_Item = "This is third item"
const val EXTRA_MESSAGE = "com.example.karim.project1.MESSAGE.One"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.message_button_one)
        val button2 = findViewById<Button>(R.id.message_button_two)
        val button3 = findViewById<Button>(R.id.message_button_three)
        button1.setOnClickListener {
            val message = First_Item
            val intent = Intent(this, SecondPage::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivity(intent)
        }
        button2.setOnClickListener {
            val message = Second_Item
            val intent = Intent(this, SecondPage::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivity(intent)
        }
        button3.setOnClickListener {
            val message = Third_Item
            val intent = Intent(this, SecondPage::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)

            }
            startActivity(intent)
        }

    }

}
