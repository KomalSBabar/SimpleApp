package com.komal.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.komal.birthdaygreet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)



        binding.btncreatebirthday.setOnClickListener {

            //passing data on click of button.
            var name = binding.etname.text.toString()
//            Toast.makeText(this,"Happy Birthday $name",Toast.LENGTH_LONG).show()
            //  for binding message in textview
            //   binding.tventername.setText(name)

        val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)

        }



    }
}