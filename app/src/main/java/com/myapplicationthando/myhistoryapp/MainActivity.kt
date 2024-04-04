package com.myapplicationthando.myhistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity<override> : AppCompatActivity() {

    // declaring varaibles
    lateinit var  resultTextView: TextView
    lateinit var  ageInput: EditText
    lateinit var  clearbutton : Button
    lateinit var  Searchbutton : Button


     @SuppressLint("MissingInflatedId")
     override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// initialising buttons
         Searchbutton=  findViewById(R.id.searchButton)
         clearbutton = findViewById(R.id.clearbutton)
         ageInput = findViewById(R.id.ageInput)
         resultTextView = findViewById(R.id.resultTextView)

         //enabling buttons to be clicked on
         Searchbutton.setOnClickListener {
                 //create varaible of age to get value from user
                 val age = ageInput.text.toString().toIntOrNull()

                 //since ages range are between 20 and 100
                 if (age != null && age in 20..100) {
                     //when age  41 displays  shaka zulu when 25 displays amy whine ..etc

                     val celebrityName = when (age) {
                         41 -> "Shaka Zulu"
                         92 -> "Queen Elizabeth"
                         50 -> "Micheal Jackson"
                         34 -> "Ricky Rick"
                         45 -> "Senzangakhona Zulu"
                         56 -> "Menzi Ngubane"
                         27 -> "Amy Whinehouse"
                         48 -> "Whitney Houston"
                         95 -> "Nelson Mandela"
                         43 -> "Chadwick Boseman"
                         else -> null

                     }
                     val message = if (celebrityName != null) "$celebrityName"
                     else "Your value is invalid , there are no celebs under this age"
                     resultTextView.text = message.toString()



                 } else {

                     resultTextView.text = "Invalid ageInput"
                 }
                 clearbutton.setOnClickListener{
                     ageInput.text.clear()
                     resultTextView.text = ""
                 }
             }
         }


    }





