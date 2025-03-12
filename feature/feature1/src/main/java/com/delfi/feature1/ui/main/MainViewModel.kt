package com.delfi.feature1.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _message = MutableLiveData("Hello from Feature 1")
    val message: LiveData<String> = _message
}