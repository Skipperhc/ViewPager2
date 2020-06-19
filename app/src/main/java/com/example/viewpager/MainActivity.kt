package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import org.michaelevans.viewpager2.Cheeses

class MainActivity : AppCompatActivity() {

    lateinit var viewPager : ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)

        viewPager.adapter = CheesePagerAdapter(Cheeses.CheeseStrings)
//        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}
