package com.example.mathsolver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first=findViewById<EditText>(R.id.editTextTextPersonName3)
        val second=findViewById<EditText>(R.id.editTextTextPersonName4)
        val add=findViewById<Button>(R.id.button6)
        val sub=findViewById<Button>(R.id.button7)
        val mult=findViewById<Button>(R.id.button8)
        val div=findViewById<Button>(R.id.button9)
        val result=findViewById<TextView>(R.id.textView2)
        val info=findViewById<Button>(R.id.button10)

        add.setOnClickListener {
            result.setText("The Add Is: "+(first.text.toString().toInt()+second.text.toString().toInt()))
        }
        sub.setOnClickListener {
            result.setText("The Sub Is: "+(first.text.toString().toInt()-second.text.toString().toInt()))
        }
        mult.setOnClickListener {
            result.setText("The Mult Is: "+(first.text.toString().toInt()*second.text.toString().toInt()))
        }
        div.setOnClickListener {
            result.setText("The Div Is: "+(first.text.toString().toInt()/second.text.toString().toInt()))
        }
        info.setOnClickListener {
            val intent:Intent = Intent(this, InfoMathSolver::class.java)
            startActivity(intent)
        }
    }
}