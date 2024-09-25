package com.example.logginglab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import timber.log.Timber
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.plant(Timber.DebugTree())

        val btnLog: Button = findViewById(R.id.button_log);
        btnLog.setOnClickListener{
            makeLog();
        }

        val btnTimber: Button = findViewById(R.id.button_timber);
        btnTimber.setOnClickListener{
            makeTimber();
        }
    }

    fun makeLog(){
        val textBox: EditText = findViewById(R.id.textBox);
        val text: String = textBox.text.toString();
        Log.println(Log.VERBOSE, "textBox", text);
    }

    fun makeTimber(){
        val textBox: EditText = findViewById(R.id.textBox);
        val text: String = textBox.text.toString();
        Timber.i(text);
    }
}