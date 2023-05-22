package com.bmnv.finestepper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bmnv.mylibrary.Demo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Demo(this).toast("Demo")
    }
}