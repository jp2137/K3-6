package com.mateusz.k3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import kotlin.random.Random

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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



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
            //val list = bubbleSort(numbers)
            var lista = ""
            var lista2 = ""
            var lista3 = ""
            var x = 0
            if(findViewById<Switch>(R.id.switch1).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch1).text.toString()
            }
            if(findViewById<Switch>(R.id.switch2).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch2).text.toString()
            }
            if(findViewById<Switch>(R.id.switch3).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch3).text.toString()
            }
            if(findViewById<Switch>(R.id.switch4).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch4).text.toString()
            }
            if(findViewById<Switch>(R.id.switch5).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch5).text.toString()
            }
            if(findViewById<Switch>(R.id.switch6).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch6).text.toString()
            }
            if(findViewById<Switch>(R.id.switch7).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch7).text.toString()
            }
            if(findViewById<Switch>(R.id.switch8).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch8).text.toString()
            }
            if(findViewById<Switch>(R.id.switch9).isChecked == true){
                lista = lista + findViewById<Switch>(R.id.switch9).text.toString()
            }
            findViewById<TextView>(R.id.textView).text = lista

            for (i in numbers)
            {
                lista2 = lista2 + i.toString() + ","
            }

            val numbers2 = arrayOfNulls<Int>(lista.length)
            for (i in 0 until lista.length)
            {
                numbers2[i]= lista[i].toString().toInt()
            }

            val list = bubbleSort(numbers2)
            for (i in numbers2)
            {
                lista3 = lista3 + i.toString() + ","
            }
            findViewById<TextView>(R.id.textView2).text = lista3
        }

    }
}