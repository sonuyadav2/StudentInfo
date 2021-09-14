package com.example.studentinformation

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Student1 : AppCompatActivity() {
    var titlename:String?="yadav"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student1)
        if(intent!=null) {
             titlename = intent.getStringExtra("student")

        }
        title = titlename
    }
}