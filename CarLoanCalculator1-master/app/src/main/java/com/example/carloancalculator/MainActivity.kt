package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener(){

            //CAR PRICE
            val input1:String = editText.text.toString()
            val carPrice:Double = input1.toDouble()

            //DOWN PAYMENT
            val input2:String = editText2.text.toString()
            val downPayment:Double = input2.toDouble()

            //INTERREST RATE
            val input3:String = editText3.text.toString()
            val interestRate:Double = input3.toDouble()

            //TERMS(MONTH)
            val input4:String = editText4.text.toString()
            val terms:Int = input4.toInt()

            val carLoan:Double = carPrice - downPayment
            val Interest:Double = carLoan * interestRate * terms
            val repayment = (carLoan+Interest)/terms/12


            textView10.text = "RESULT\n======\n\n"+"Car Loan = RM%.2f\n".format(carLoan) +
                    "Interest = RM%.2f\n".format(Interest) +
                    "Monthly Repayment = RM%.2f\n".format(repayment)

        }
    }
}
