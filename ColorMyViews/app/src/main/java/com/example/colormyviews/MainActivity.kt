package com.example.colormyviews

import android.databinding.DataBindingUtil
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        binding.apply {
            val clickableView: List<View> = listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText, redButton, yellowButton, greenButton)
            for (item in clickableView){
                item.setOnClickListener { makeColored(it) }
            }
        }
    }

    private fun makeColored(view: View?) {
        binding.apply {
            when (view) {
                // Boxes using Color class colors for background
                boxOneText -> view.setBackgroundColor(Color.DKGRAY)
                boxTwoText -> view.setBackgroundColor(Color.GRAY)
                // Boxes using Android color resources for background
                boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
                boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
                boxFiveText -> view.setBackgroundResource(android.R.color.holo_green_light)
                redButton -> boxThreeText.setBackgroundResource(R.color.my_red)
                yellowButton -> boxFourText.setBackgroundResource(R.color.my_yellow)
                greenButton -> boxFiveText.setBackgroundResource(R.color.my_green)
                else -> view?.setBackgroundColor(Color.LTGRAY)
            }
        }

    }
}