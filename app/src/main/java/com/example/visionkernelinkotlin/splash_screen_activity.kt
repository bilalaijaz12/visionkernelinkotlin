package com.example.visionkernelinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.content.Intent
import kotlinx.coroutines.*


class splash_screen_activity : AppCompatActivity() {
    private val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        activityScope.launch {
            delay(2000)  // delay for 2 seconds
            startActivity(Intent(this@splash_screen_activity, loginscreen::class.java))
            finish() // close this activity
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        activityScope.cancel()
    }
}