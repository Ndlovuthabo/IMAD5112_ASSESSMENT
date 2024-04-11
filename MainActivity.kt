package com.example.myapplication1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaration
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..29 -> "Pop Smoke"
                    in 30..39 -> "steve Biko"
                    in 40..49 -> "Chadwick Baseman"
                    in 50..59 -> "Shakespeare"
                    in 60..69 -> "Carrie Fisher"
                    in 70..79 -> "Elizabeth taylor"
                    in 80..89 -> "Mary Tylor Moore"
                    in 90..99 -> "Candido Camera Guerra"
                    in 100..110 -> "glynis Johns"
                    else -> "Enter a valid age"
                }
                txtResult.text = "age: $age\n${
                    when (result) {
                        "Pop Smoke" -> "Pop Smoke died at the age of 20."
                        "Steve Biko" -> "Steve Biko died at the age of 30."
                        "Chadwick Baseman" -> "Chadwick Baseman died at the age of 45."
                        "Shakespeare" -> "Shakespeare died at the age of 52."
                        "Carrie Fisher" -> "Carrie Fisher died at the age of 65."
                        "Elizabeth Taylor" -> "Elizabeth Taylor died at the age of 79."
                        "Mary Tylor Moore" -> "Mary Tylor Moore died at the age of 85."
                        "Candido Camera Guerra" -> "Candido Camera Guerra died at the age of 99."
                        "Glynis Johns" -> "Glynis Johns died at the age of 100."
                        else -> "Please enter a valid age"
                    }
                }              }"
            } else {
                txtResult.text = "Please enter a valid age"
            }
        }
        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }}