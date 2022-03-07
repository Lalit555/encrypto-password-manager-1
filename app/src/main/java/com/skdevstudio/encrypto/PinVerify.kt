package com.skdevstudio.encrypto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skdevstudio.encrypto.databinding.ActivityPinVerifyBinding

class PinVerify : AppCompatActivity() {

    private lateinit var binding: ActivityPinVerifyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPinVerifyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.root.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finishAffinity()
        }

    }
}