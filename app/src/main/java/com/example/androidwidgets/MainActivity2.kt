package com.example.androidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var textView = findViewById<TextView>(R.id.textView)
        val i2 = intent.getStringExtra(KEY_1);
        //textView.text = i2;


    }
}