package com.mcandroid.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeText()
    }

    fun changeText(){
        btnSayHello.setOnClickListener{

            var message = "Hello, " + etName.text.toString()
            message += "\n You are " + numAge.text.toString()
            message += "\n Your favorite movie is " + etMovie.text.toString()
            lblMessage.text = message
        }
    }
}
