package com.example.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class DashboardScreen : AppCompatActivity() {
    lateinit var formPageButton:Button
    lateinit var viewAllDataButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        formPageButton=findViewById(R.id.formPage) as Button
        viewAllDataButton=findViewById(R.id.viewDataFromRoom) as Button
        formPageButton.setOnClickListener{
            var intent=Intent(this, FormActivity::class.java)
            startActivity(intent)
        }
    }
}