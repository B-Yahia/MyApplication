package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        Cal.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        var dis = findViewById<EditText>(R.id.dist)
        var disKM = findViewById<Button>(R.id.km)
        var disML = findViewById<Button>(R.id.miles)
        var rlt = findViewById<TextView>(R.id.result)
        val coe1 = 1.60934
        val coe2 = 0.621371
        disKM.setOnClickListener( View.OnClickListener{
            rlt.text= ((dis.text.toString().toInt()*coe1).toString())
            Toast.makeText( this,rlt.text,Toast.LENGTH_LONG).show()
        })
        disML.setOnClickListener( View.OnClickListener{
            rlt.text= ((dis.text.toString().toInt()*coe2).toString())
            Toast.makeText( this,rlt.text,Toast.LENGTH_LONG).show()
        })


    }
}
