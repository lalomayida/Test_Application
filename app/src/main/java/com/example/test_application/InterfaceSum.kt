package com.example.test_application

import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.operations.*

class interfaceSum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.operations)

        var val1: Editable? = (editTextTextPersonName3.text)
        var val2: Editable? = (editTextTextPersonName.text)

        button.setOnClickListener{
            textView.text = val1
        }
    }
}