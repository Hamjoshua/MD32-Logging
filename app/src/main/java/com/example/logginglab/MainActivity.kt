package com.example.logginglab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button_ok);
        btn.setOnClickListener {
            showToast();
        }

    }

    private fun showToast(){
        Toast.makeText(this, "Кнопка ОК", Toast.LENGTH_SHORT).show();
    }
}