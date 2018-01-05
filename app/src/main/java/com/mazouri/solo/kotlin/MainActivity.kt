package com.mazouri.solo.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(v:View) {
        toast("U click the button")
    }
}
