package com.npsoni.firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    fun change (view: View) {
//        imageView.setImageResource(R.drawable.motivational2)
//
//    }

    fun sum (view: View){
        val a = numberOne.text.toString().toInt()
        val b = numberTwo.text.toString().toInt()

        val answer = a + b
        resultView.text = ("Answer : $answer")
    }

    fun sub (view: View){
        val a = numberOne.text.toString().toInt()
        val b = numberTwo.text.toString().toInt()

        val answer = a - b
        resultView.text = ("Answer : $answer")
    }

    fun multiple (view: View){
        val a = numberOne.text.toString().toInt()
        val b = numberTwo.text.toString().toInt()

        val answer = a * b
        resultView.text = ("Answer : $answer")
    }

    fun division (view: View){
        val a = numberOne.text.toString().toInt()
        val b = numberTwo.text.toString().toInt()

        val answer = a / b
        resultView.text = ("Answer : $answer")
    }
}
