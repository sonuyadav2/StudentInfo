package com.example.studentinformation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class DesktopFile : AppCompatActivity() {
    lateinit var timer:Timer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desktop_file)
        title="STUDENTS"
        timer= Timer()
        Timer().schedule(2000) {
            var intent=Intent(this@DesktopFile,Loginpage::class.java)
            startActivity(intent);
        }


    }
}

private fun Timer.schedule(timerTask: TimerTask) {

}
