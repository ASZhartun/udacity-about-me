package com.example.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener { addNickname(it) }
    }

    fun addNickname(view : View) {
        val input = findViewById<EditText>(R.id.nickname_edit)
        val nickname = findViewById<TextView>(R.id.nickname)
        val button = findViewById<Button>(R.id.button)

        nickname.text = input.text

        input.visibility = View.GONE
        nickname.visibility = View.VISIBLE
        button.visibility = View.GONE

        val imm =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}