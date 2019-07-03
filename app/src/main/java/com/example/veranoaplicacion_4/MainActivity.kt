package com.example.veranoaplicacion_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var marcadorA : Int = 0
    var marcadorB : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Reset(v: View){
        etA.setText("0")
        etB.setText("0")
        marcadorA=0
        marcadorB=0
    }
    fun A1(v:View){
        marcadorA++
        etA.setText("$marcadorA")
    }
    fun A2(v:View){
        marcadorA+=2
        etA.setText("$marcadorA")
    }
    fun A3(v:View){
        marcadorA+=3
        etA.setText("$marcadorA")
    }
    fun B1(v:View){
        marcadorB++
        etB.setText("$marcadorB")
    }
    fun B2(v:View){
        marcadorB+=2
        etB.setText("$marcadorB")
    }fun B3(v:View){
        marcadorB+=3
        etB.setText("$marcadorB")
    }

}
