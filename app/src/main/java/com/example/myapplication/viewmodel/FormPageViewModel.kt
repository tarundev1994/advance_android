package com.example.myapplication.viewmodel

import android.util.Log
import android.view.View
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.Utils.Constant

//Form Page View Model
class FormPageViewModel : ViewModel() {
    var name: MutableLiveData<String> = MutableLiveData()
    val email: MutableLiveData<String> = MutableLiveData()
    val phoneNumber: MutableLiveData<Int> = MutableLiveData()
    val addressDetails: MutableLiveData<String> = MutableLiveData()

    // the rest of your fields as normal

    var formErrors = ObservableArrayList<FormErrors>()

    //Validation Function
    fun isFormValid(): Boolean {
        formErrors.clear()
        if (name.value.isNullOrEmpty() == true) {
            formErrors.add(FormErrors.INVALID_NAME)
        }
      else  if (email.value.isNullOrEmpty() == true) {
            formErrors.add(FormErrors.INVALID_EMAIL)
        }
        else if (phoneNumber.value.toString().isNullOrEmpty() == true) {
            formErrors.add(FormErrors.INVALID_CONTACT_DETAIL)
        }
        else  if (addressDetails.value.isNullOrEmpty() == true) {
            formErrors.add(FormErrors.INVAlID_ADDRESS)
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