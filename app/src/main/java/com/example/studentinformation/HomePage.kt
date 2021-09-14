package com.example.studentinformation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomePage : AppCompatActivity() {
    lateinit var btMoreinfo: Button
  lateinit var student1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        student1=findViewById(R.id.student11)
        btMoreinfo = findViewById(R.id.btmMoreinfo)

        btMoreinfo.setOnClickListener {
            var student=student1.text.toString()
            var intent = Intent(this@HomePage, Student1::class.java)
            intent.putExtra("student",student)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}