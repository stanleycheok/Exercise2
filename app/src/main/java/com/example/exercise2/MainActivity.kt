package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {

            //weight
            val input1: String = editText.text.toString()
            val weight: Double = input1.toDouble()


            //Height
            val input2: String = editText2.text.toString()
            val height: Double = input2.toDouble()


            val result: Double = weight / (height * height)

            val status:String

            if (result < 18.5) {
                imageView2.setImageResource(R.drawable.under)
              //  textView4.text = " UnderWeight: \n\n".format(result)
                status = "Under"
            }

            else if (result >= 18.5 && result <= 24.9) {
                imageView2.setImageResource(R.drawable.normal)
              //  textView4.text = " Normal: \n\n".format(result)
                status = "Normal"
            }

            else{
                imageView2.setImageResource(R.drawable.over)
              //  textView4.text = " OverWeight: \n\n".format(result)
                status = "OverWeight"
            }

            textView4.text = "BMI : %.2f (%s) ".format(result,status)
        }
        button2.setOnClickListener() {

            editText.text.clear()
            editText2.text.clear()

            textView4.text.isEmpty()


            imageView2.invalidate();
            imageView2.setImageBitmap(null);
        }


    }


}
