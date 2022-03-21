package com.example.livedatacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MultiplyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MultiplyViewModel::class.java)

        val resultText = findViewById<TextView>(R.id.tv_result)

        viewModel.calcNum.observe(this, Observer {
            resultText.text = viewModel.getResult().toString()
        })

        setNumbers()
    }

    private fun setNumbers() {
        val leftNumber = findViewById<EditText>(R.id.et_leftNumber)
        val rightNumber = findViewById<EditText>(R.id.et_rightNumber)
        val equalsButton = findViewById<ImageButton>(R.id.btn_equals)
        equalsButton.setOnClickListener{
            viewModel.leftNumber = leftNumber.text.toString().toInt()
            viewModel.rightNumber = rightNumber.text.toString().toInt()
            viewModel.calcNum.value = viewModel.numCalculations++
        }
    }

}