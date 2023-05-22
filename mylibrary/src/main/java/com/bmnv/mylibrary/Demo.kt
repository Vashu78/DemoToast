package com.bmnv.mylibrary

import android.content.Context
import android.widget.Toast

class Demo(private val context: Context) {
    fun toast(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}