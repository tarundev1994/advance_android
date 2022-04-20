package com.example.myapplication.fragment

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.R
import com.example.myapplication.Utils.Constant
import com.example.myapplication.databinding.FragmentFormBinding
import com.example.myapplication.viewmodel.FormPageViewModel

class FormPageFragment : Fragment() {
    lateinit var fragmentFormBinding:FragmentFormBinding
    lateinit var viewModel:FormPageViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(FormPageViewModel::class.java)

        fragmentFormBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_form,container,false)
        fragmentFormBinding.viewModel = viewModel;
        return fragmentFormBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var button=view.findViewById<Button>(R.id.submit)
        button.setOnClickListener{
            if (viewModel.isFormValid()) {
                viewModel.saveData()
                // the rest of your logic to proceed to next screen etc.
            }
            else{
                Log.d(Constant.LOGCAT,"Something error!")
            }
        }
    }
}

