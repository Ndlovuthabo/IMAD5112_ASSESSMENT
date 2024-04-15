package com.example.whenstatement1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.time.Year

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaration of the generation to generation
        val txtYear = findViewById<EditText>(R.id.txtYear)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        btnGenerate.setOnClickListener {
            val Year = txtYear.text.toString().toIntOrNull()
            if (Year != null)
                val result = when (Year) {
                in 1925..1945 -> "Silent Generation"
                in 1946..1964 -> "Baby Boomer"
                in 1965..1979 -> "Generation X"
                in 1980..1994 -> "Millennial"
                in 1995..2009 -> "Generation Z"
                in 2010..2030 -> "Alpha"
                else -> "New Generation"
            }
            txtResult.text = "Year: $\n${
                when (result) {
                    "Silent Generation" -> "Silent Generation where born between the year of 1925 to 1945."
                    "Baby Boomer" -> "Baby Boomers where born between the year of 1946 to 1964."
                    "Generation X" -> "Generation X where born between the year of 1965 to 1979."
                    "Millennial" -> "Millennial where born between the year of 1980 to 1994."
                    "Geneation Z" -> "Geberation Z where born between the year of 1995 to 2009."
                    "Alpha" -> "Alphas where born between the year of 2010 to 2030."
                    else -> "Upcomming Generation"
                }
            }"
        } else {
            txtResult.text = "Enter a valid year."
        }

            btnCancel.setOnClickListener {
                txtYear.text.clear()
                txtResult.text = ""

            }
        }
    }




