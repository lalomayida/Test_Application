package com.example.test_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var timesClicked = 0

        button.setOnClickListener{
            Toast.makeText(this@MainActivity, "You clicked",Toast.LENGTH_SHORT).show()
            textView.text = timesClicked.toString()
            timesClicked += 1
        }
    }
}