package com.example.myapplication.viewmodel

import android.util.Log
import android.view.View
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.Utils.Constant

class FormPageViewModel : ViewModel() {
    var name: MutableLiveData<String> = MutableLiveData()
    val email: MutableLiveData<String> = MutableLiveData()
    val phoneNumber: MutableLiveData<Int> = MutableLiveData()
    val addressDetails: MutableLiveData<String> = MutableLiveData()

    // the rest of your fields as normal

    val formErrors = ObservableArrayList<FormErrors>()

    fun isFormValid(): Boolean {
        formErrors.clear()

        if (name.value?.isNullOrEmpty() == true) {
            formErrors.add(FormErrors.INVALID_NAME)
        }
        // all the other validation you require
        return formErrors.isEmpty()
    }

    fun saveData() {
        Log.d(Constant.LOGCAT, "Save Data")
    }

    enum class FormErrors {
        INVALID_NAME,
        INVALID_EMAIL,
        INVALID_CONTACT_DETAIL,
        INVAlID_ADDRESS,
    }
}