package com.example.gacharollsimulator

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity() : AppCompatActivity(), View.OnClickListener {


    val valIntFate: TextView = findViewById<TextView>(R.id.numIntFate)
    val valAquaint: TextView = findViewById<TextView>(R.id.numAquaint)
    val valPrimo: TextView = findViewById<TextView>(R.id.numPrimo)
    val valGenesis: TextView = findViewById<TextView>(R.id.numGenesis)
    var valGlitter: TextView = findViewById<TextView>(R.id.numGlitter)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onClick(v: View?) {
        Toast.makeText(this, "You clicked $v", Toast.LENGTH_SHORT).show()
    }

    /*
    fun setTotalText(){
        var totalRoll: TextView = findViewById<TextView>(R.id.numTotalRoll)
        totalRoll.text = calculateTotal().toString()
    }
    fun setLimitedText(){
        var limitedRoll: TextView = findViewById<TextView>(R.id.numLimitedRoll)
        limitedRoll.text = calculateLimited().toString()
    }
    fun setStandardText(){
        var standardRoll: TextView = findViewById<TextView>(R.id.numStandardRoll)
        standardRoll.text = calculateStandard().toString()
    }

    fun calculateTotal(): Int {
        return (valIntFate.text.toString().toInt()) +
                (valPrimo.text.toString().toInt() / 160) +
                (valGenesis.text.toString().toInt() / 160) +
                (valGlitter.text.toString().toInt() / 5) +
                (valAquaint.text.toString().toInt() / 5)
    }
    fun calculateLimited(): Int {

        return (valIntFate.text.toString().toInt()) +
                (valPrimo.text.toString().toInt() / 160) +
                (valGenesis.text.toString().toInt() / 160) +
                (valGlitter.text.toString().toInt() / 5)
    }
    fun calculateStandard(): Int {


        return (valAquaint.text.toString().toInt()) +
                (valPrimo.text.toString().toInt() / 160) +
                (valGenesis.text.toString().toInt() / 160) +
                (valGlitter.text.toString().toInt() / 5)
    }

    */

    }


