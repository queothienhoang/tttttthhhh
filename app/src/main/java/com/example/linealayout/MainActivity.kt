package com.example.linealayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var edtNumber1: EditText
    private lateinit var edtNumber2: EditText
    private lateinit var textViewResult :TextView
    private lateinit var buttonPlus: Button
    private lateinit var buttonMinus: Button
    private lateinit var buttonMultipli: Button
    private lateinit var buttonDivision: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtNumber1 = findViewById(R.id.edit_text_number1)
        edtNumber2 = findViewById(R.id.edit_text_number2)
        textViewResult = findViewById(R.id.text_view_result)
        buttonPlus = findViewById(R.id.button_plus)
        buttonMinus = findViewById(R.id.button_minus)
        buttonMultipli = findViewById(R.id.button_multiplication)
        buttonDivision = findViewById(R.id.button_division)

        buttonPlus.setOnClickListener(object  : OnClickListener{
            override fun onClick(p0: View?) {

                var textNumber1 = edtNumber1.text.toString()
                var textNumber2 = edtNumber2.text.toString()
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(this@MainActivity, "Bạn chưa nhâp đầy đủ số", Toast.LENGTH_SHORT).show()
                    return
                }
                val number1 = textNumber1.toInt()
                val number2 = textNumber2.toInt()

                val result = number1 + number2
                textViewResult.text = "Result: $number1 + $number2 = $result"
            }

        })
        buttonMinus.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                var textNumber1 = edtNumber1.text.toString()
                var textNumber2 = edtNumber2.text.toString()
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(this@MainActivity, "Bạn chưa nhâp đầy đủ số", Toast.LENGTH_SHORT).show()
                    return
                }
                val number1 = textNumber1.toInt()
                val number2 = textNumber2.toInt()

                val result = number1 - number2
                textViewResult.text = "Result: $number1 - $number2 = $result"
            }

        })
        buttonMultipli.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                var textNumber1 = edtNumber1.text.toString()
                var textNumber2 = edtNumber2.text.toString()
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(this@MainActivity, "Bạn chưa nhâp đầy đủ số", Toast.LENGTH_SHORT).show()
                    return
                }
                val number1 = textNumber1.toInt()
                val number2 = textNumber2.toInt()

                val result = number1 * number2
                textViewResult.text = "Result: $number1 * $number2 = $result"
            }

        })
        buttonDivision.setOnClickListener(object :OnClickListener{
            override fun onClick(p0: View?) {
                var textNumber1 = edtNumber1.text.toString()
                var textNumber2 = edtNumber2.text.toString()
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(this@MainActivity, "Bạn chưa nhâp đầy đủ số", Toast.LENGTH_SHORT).show()
                    return
                }
                val number1 = textNumber1.toFloat()
                val number2 = textNumber2.toFloat()

                val result = number1 / number2
                textViewResult.text = "Result: $number1 / $number2 = $result"
            }

        })

    }
}