package com.mateusz.k3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun bubbleSort(arr:IntArray):IntArray{
            var swap = true
            while(swap){
                swap = false
                for(i in 0 until arr.size-1){
                    if(arr[i] > arr[i+1]){
                        val temp = arr[i]
                        arr[i] = arr[i+1]
                        arr[i + 1] = temp

                        swap = true
                    }
                }
            }
            return arr
        }

        val numbers = intArrayOf(1,2,3,4,5,6,7,8,9)

        findViewById<Button>(R.id.button1).setOnClickListener {
            var x=0
            for (i in numbers)
            {
                numbers[x] = Random.nextInt(1,10)
                x++
            }
            if(findViewById<Switch>(R.id.switch1).isChecked == true){
                findViewById<Switch>(R.id.switch1).text = numbers[0].toString()
            }
            if(findViewById<Switch>(R.id.switch2).isChecked == true){
                findViewById<Switch>(R.id.switch2).text = numbers[1].toString()
            }
            if(findViewById<Switch>(R.id.switch3).isChecked == true){
                findViewById<Switch>(R.id.switch3).text = numbers[2].toString()
            }
            if(findViewById<Switch>(R.id.switch4).isChecked == true){
                findViewById<Switch>(R.id.switch4).text = numbers[3].toString()
            }
            if(findViewById<Switch>(R.id.switch5).isChecked == true){
                findViewById<Switch>(R.id.switch5).text = numbers[4].toString()
            }
            if(findViewById<Switch>(R.id.switch6).isChecked == true){
                findViewById<Switch>(R.id.switch6).text = numbers[5].toString()
            }
            if(findViewById<Switch>(R.id.switch7).isChecked == true){
                findViewById<Switch>(R.id.switch7).text = numbers[6].toString()
            }
            if(findViewById<Switch>(R.id.switch8).isChecked == true){
                findViewById<Switch>(R.id.switch8).text = numbers[7].toString()
            }
            if(findViewById<Switch>(R.id.switch9).isChecked == true){
                findViewById<Switch>(R.id.switch9).text = numbers[8].toString()
            }
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val list = bubbleSort(numbers)
            var lista = ""
            if(findViewById<Switch>(R.id.switch1).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch1).text +", "
            }
            if(findViewById<Switch>(R.id.switch2).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch2).text +", "
            }
            if(findViewById<Switch>(R.id.switch3).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch3).text +", "
            }
            if(findViewById<Switch>(R.id.switch4).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch4).text +", "
            }
            if(findViewById<Switch>(R.id.switch5).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch5).text +", "
            }
            if(findViewById<Switch>(R.id.switch6).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch6).text +", "
            }
            if(findViewById<Switch>(R.id.switch7).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch7).text +", "
            }
            if(findViewById<Switch>(R.id.switch8).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch8).text +", "
            }
            if(findViewById<Switch>(R.id.switch9).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch9).text +", "
            }
            findViewById<TextView>(R.id.textView).text = lista
        }

    }
}