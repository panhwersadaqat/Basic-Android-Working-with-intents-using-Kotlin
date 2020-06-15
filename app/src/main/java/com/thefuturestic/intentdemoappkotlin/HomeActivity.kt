package com.thefuturestic.intentdemoappkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    lateinit var firstBtn: Button
    lateinit var secondBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        firstBtn = findViewById<View>(R.id.first_activity) as Button
        secondBtn = findViewById<View>(R.id.secont_activity) as Button

        firstBtn.setOnClickListener {
            val i = Intent(this@HomeActivity, FirstActivity::class.java)
            startActivity(i)
        }

        secondBtn.setOnClickListener {
            val i = Intent(this@HomeActivity, SecondActivity::class.java)
            startActivity(i)
        }
    }
}