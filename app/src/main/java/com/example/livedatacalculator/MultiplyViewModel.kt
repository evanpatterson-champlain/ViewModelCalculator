package com.example.livedatacalculator


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MultiplyViewModel : ViewModel() {

    val currentResult: MutableLiveData<Int> by lazy{
        MutableLiveData<Int>()
    }

}