package com.example.imadassignment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       val age_of_user = findViewById<EditText>(R.id.editTextNumber)
        val historical_data = findViewById<TextView>(R.id.textView2)
        val generate = findViewById<Button>(R.id.button)
        val clear = findViewById<Button>(R.id.button2)



        generate?.setOnClickListener {
            val age = age_of_user.text.toString().toInt()
            val result: String
            if (age==95) {

                    result = "You are 95 years old.This is the same age that Nelson Mandela passed away.He was an an outstanding politician who took South Africa to greater levels"
                }
                else if (age==36 ) {
                    result= "You are 36 years old.This is the same age that Marilyn Monroe passed away,she was an American actress and model"
                }
                else if (age==96)  {
                    result= "You are 96 years old.This is the same age that Queen Elizabeth passed away,she was the Queen of England"
                }
                else if (age==22) {
                    result ="You are 22 years old.This is the same age that Aaliyah Haughton passed away ,she was a legend of contemporary R&B and hip hop"
                }
                else if (age==39)  {
                    result= "You are 39 years old.This is the same age that Martin Luther King passed away,he was an activist and political philosopher"
                }
                else if (age==46) {
                    result= "You are 46 years old.This is the age John F Kennedy passed away,he was an American politician and president of the United States"
                }
                else if (age==56) {
                    result="You are 56 years old.This is the same age adolf hitler passed away,he was the director of Nazi Germany"

                }
                else if (age==50 ){
                    result= "You are 50 years old.This the same age Micheal Jackson passed away,he was an American singer known as the king of pop"

                }
                else if (age==52) {
                    result=  "You are 52 years old.This is the same age Shakespear passed away ,he was a astounding poet and actor}"

                }
                else if (age==42) {
                result =
                    "You are 42 years old .This is the same age Elvis Presley passed away ,he was an American singer widely known as the king of rock and roll"
            }
                else {
                    result = "There is no historical data for this age "
                }
            if (age < 20 || age > 100) {
                historical_data.text = "Age is out of range .Number must be between 20 and 100"
            } else {
                historical_data.text = result }
            }
            clear?.setOnClickListener {
                historical_data.text = ""
            }
            }
            }

