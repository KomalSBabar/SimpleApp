package com.komal.birthdaygreet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.komal.birthdaygreet.databinding.ActivityBirthdayGreetingBinding
import com.komal.birthdaygreet.databinding.ActivityMainBinding

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val  NAME_EXTRA = "name_extra"
    }
    private lateinit var binding: ActivityBirthdayGreetingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra(NAME_EXTRA)
//        binding.birthdaygreeting.setText(name)

        binding.birthdaygreeting.text="Happy Birthday\n $name"


    }
}