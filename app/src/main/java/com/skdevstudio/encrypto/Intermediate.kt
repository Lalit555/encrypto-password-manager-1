package com.skdevstudio.encrypto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Intermediate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intermediate)

        var btn : Button = findViewById<Button>(R.id.authenticate)
        btn.setOnClickListener {
            startActivity(Intent(this,BiometricActivity::class.java))
            finish()
        }

    }
}