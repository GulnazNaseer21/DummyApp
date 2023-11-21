package com.example.test.dummy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test.mylibrary.ToastClassGulnaz

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastClassGulnaz.toastSimple(this, "MyToast")

    }

}