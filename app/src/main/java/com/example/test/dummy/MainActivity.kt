package com.example.test.dummy

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast = Toast.makeText(
            applicationContext,
            "Your string here", Toast.LENGTH_SHORT
        )
        toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
        toast.show()
    }


}