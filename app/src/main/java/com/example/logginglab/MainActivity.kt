package com.example.logginglab

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText: EditText = findViewById(R.id.editText)

        findViewById<Button>(R.id.btnBlackText).setOnClickListener{
            makeTextBlack(editText)
        }

        findViewById<Button>(R.id.btnRedText).setOnClickListener{
            makeTextRed(editText)
        }

        findViewById<Button>(R.id.btnSize8).setOnClickListener{
            makeSize8(editText)
        }

        findViewById<Button>(R.id.btnSize24).setOnClickListener{
            makeSize24(editText)
        }

        findViewById<Button>(R.id.btnWhiteBg).setOnClickListener{
            makeBgWhite(editText)
        }

        findViewById<Button>(R.id.btnYellowBg).setOnClickListener{
            makeBgYellow(editText)
        }
    }

    fun makeTextBlack(textElem: EditText){
        textElem.setTextColor(Color.BLACK)
    }

    fun makeTextRed(textElem: EditText){
        textElem.setTextColor(Color.RED)
    }

    fun makeSize8(textElem: EditText){
        textElem.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8f)
    }

    fun makeSize24(textElem: EditText){
        textElem.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
    }

    fun makeBgWhite(textElem: EditText){
        textElem.setBackgroundColor(Color.WHITE)
    }

    fun makeBgYellow(textElem: EditText){
        textElem.setBackgroundColor(Color.YELLOW)
    }
}