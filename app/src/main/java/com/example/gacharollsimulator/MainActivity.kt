package com.example.gacharollsimulator

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onClick(v: View?) {
        updateRolls()
    }

    private fun getForTotal(intFate: Int, aqFate :Int, primo: Int,genesis: Int,star: Int): Int
    {
        return intFate + aqFate + (primo/160) + (genesis/160) + (star/5)
    }
    private fun getForLimited(intFate: Int,primo: Int,genesis: Int,star: Int): Int
    {
        return intFate + (primo/160) + (genesis/160) + (star/5)
    }

    private fun getForStandard(aqFate :Int,primo: Int, genesis: Int, star: Int): Int
    {
        return  aqFate + (primo/160) + (genesis/160) + (star/5)
    }
    private fun updateRolls() {
        val curr: TextView = findViewById(R.id.numIntFate)
        val a = curr.text.toString().toInt()
        val curr2: TextView = findViewById(R.id.numAquaint)
        val b = curr2.text.toString().toInt()
        val curr3: TextView = findViewById(R.id.numPrimo)
        val c = curr3.text.toString().toInt()
        val curr4: TextView = findViewById(R.id.numGenesis)
        val d = curr4.text.toString().toInt()
        val curr5: TextView = findViewById(R.id.numGlitter)
        val e = curr5.text.toString().toInt()


        updateLimitedResult(getForLimited(a,c,d,e).toString())
        updateStandardResult(getForStandard(b,c,d,e).toString())
        updateTotalResult(getForTotal(a,b,c,d,e).toString())


    }
     private fun updateLimitedResult(toThis: String?) {
        val result: TextView = findViewById(R.id.numLimitedRoll)
        result.text = toThis
    }
     private fun updateStandardResult(toThis: String?) {
        val result: TextView = findViewById(R.id.numStandardRoll)
        result.text = toThis
    }
    private fun updateTotalResult(toThis: String?) {
        val result: TextView = findViewById(R.id.numTotalRoll)
        result.text = toThis
    }







    }


