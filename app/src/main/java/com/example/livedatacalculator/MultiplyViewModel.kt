package com.example.livedatacalculator


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MultiplyViewModel : ViewModel() {

    var numCalculations: Int = 0
    var leftNumber: Int = 0
    var rightNumber: Int = 0

    val calcNum: MutableLiveData<Int> = MutableLiveData<Int>(0)

    fun getResult(): Int {
        return leftNumber * rightNumber
    }

}