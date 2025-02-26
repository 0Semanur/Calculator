package com.semanuraltintas.calculator

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.semanuraltintas.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var num1:Double?=null
    var num2:Double?=null
    var result:Double?=null
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun plus(view: View) {
        num1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        num2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (num1 != null && num2 != null) {
            result = num1!! + num2!!
            binding.textView.text = "Result: ${result}"
        } else {
            binding.textView.text = "Enter numbers"
        }
    }

    fun minus(view: View) {
        num1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        num2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (num1 != null && num2 != null) {
            result = num1!! - num2!!
            binding.textView.text = "Result: ${result}"
        } else {
            binding.textView.text = "Enter numbers"
        }
    }

    fun division(view: View) {
        num1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        num2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (num1 != null && num2 != null) {
            if (num2 == 0.0) {
                binding.textView.text = "Cannot divide by zero"
            } else {
                result = num1!! / num2!!
                binding.textView.text = "Result: ${result}"
            }
        } else {
            binding.textView.text = "Enter numbers"
        }
    }

    fun multiplication(view: View) {
        num1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        num2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (num1 != null && num2 != null) {
            result = num1!! * num2!!
            binding.textView.text = "Result: ${result}"
        } else {
            binding.textView.text = "Enter numbers"
        }
    }


}