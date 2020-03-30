package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstNum = findViewById<View>(R.id.num1)as EditText
        var SecondNum = findViewById<View>(R.id.num2)as EditText
        var rslt = findViewById<View>(R.id.result)as TextView
        var addition = findViewById<View>(R.id.addBtn)as Button
        var soustraction = findViewById<View>(R.id.minusBtn)as Button
        var multiplication = findViewById<View>(R.id.multiBtn)as Button
        var division = findViewById<View>(R.id.divBtn)as Button
        var power = findViewById<View>(R.id.powerBtn)as Button


        addition.setOnClickListener (View.OnClickListener {
            rslt.text= (firstNum.text.toString().toInt()+SecondNum.text.toString().toInt()).toString()
            Toast.makeText( this,rslt.text,Toast.LENGTH_LONG).show()
        })

        soustraction.setOnClickListener (View.OnClickListener {
            rslt.text= (firstNum.text.toString().toInt()-SecondNum.text.toString().toInt()).toString()
            Toast.makeText( this,rslt.text,Toast.LENGTH_LONG).show()
        })
        multiplication.setOnClickListener (View.OnClickListener {
            rslt.text= (firstNum.text.toString().toInt()*SecondNum.text.toString().toInt()).toString()
            Toast.makeText( this,rslt.text,Toast.LENGTH_LONG).show()
        })
        division.setOnClickListener (View.OnClickListener {
            if (SecondNum.text.toString() != "0"){
                rslt.text= (firstNum.text.toString().toInt()/SecondNum.text.toString().toInt()).toString()
                Toast.makeText( this,rslt.text,Toast.LENGTH_LONG).show()
            }else {
                rslt.text= "Incorrect input"
                Toast.makeText( this,rslt.text,Toast.LENGTH_LONG).show()
            }
        })
        power.setOnClickListener (View.OnClickListener {
            rslt.text= pow(firstNum.text.toString().toInt().toDouble(),
                    SecondNum.text.toString().toInt().toDouble()
            ).toString()
            Toast.makeText( this,rslt.text,Toast.LENGTH_LONG).show()
        })
    }
}
