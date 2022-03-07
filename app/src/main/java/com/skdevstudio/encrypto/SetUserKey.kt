package com.skdevstudio.encrypto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skdevstudio.encrypto.databinding.ActivityAddIdsBinding
import com.skdevstudio.encrypto.databinding.ActivitySetUserKeyBinding

class SetUserKey : AppCompatActivity() {

    private lateinit var binding: ActivitySetUserKeyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySetUserKeyBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}