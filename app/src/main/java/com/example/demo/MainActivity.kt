package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configView()
    }

    private fun configView() {
        findViewById<Button>(R.id.bt_toast).setOnClickListener {
            Toast.makeText(applicationContext, "Hello!", Toast.LENGTH_SHORT).show()
        }
    }
}