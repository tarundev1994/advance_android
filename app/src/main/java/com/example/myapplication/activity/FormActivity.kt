package com.example.myapplication.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication.R
import com.example.myapplication.fragment.FormPageFragment

class FormActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formscreen)
        var formPageFragment=FormPageFragment()
        loadFragment(formPageFragment)
    }
    fun loadFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.replace(R.id.formFragment,fragment)
        fragmentManager.commit()
        }
    }
