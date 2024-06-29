package com.memino.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables && Constants
        //Integer

        println("-----INTEGER-----")

        var x = 5
        var y = 4

        println(x*y)

        var age = 35
        val result= age / 7 * 5
        println(result)

        var myInteger : Int

        myInteger = 10

        val a : Int = 5
        println(a/2)

        //Double & Float

        println("-----Double & Float-----")

        val pi = 3.14
        println(pi*2)

        val myFloat = 3.14f
        println(myFloat*2)

        var myAge : Double
        myAge = 23.0
        println(myAge/2)

        //camelCase
        //snake_case

        //String
        println("-----STRING----")

        val myString = "muhammed Emin Özdemir"
        val name = "James"
        val surname = "Hatfield"
        val fullname = name + " " + surname
        println(fullname)

        println(myString.capitalize())

        //Boolean
        println("-----BOOLEAN----")
        var myBoolean : Boolean = true
        myBoolean = false

        println(3<5)
        println(6<3)

        //Conversion
        println("-----CONVERSION-----")

        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger*2)

        //Arrays
        println("-----ARRAYS-----")

        val myArray = arrayOf("James", "Kirk", "Rob", "Lars")

        //index
        println(myArray[0])
        myArray[0] = "James Hetfield"
        println(myArray[0])
        println(myArray)

        myArray.set(1, "Kirk Hammett")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])

        val myNewArray= doubleArrayOf(1.0,2.0,3.0)

        val mixedArray = arrayOf("Memino",5)
        println(mixedArray[0])
        println(mixedArray[1])

        println("-----LIST-----")

        val myMusician = arrayListOf<String>("James","Kirk")
        println(myMusician[0])
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])

        val myArrayList=ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        val myMixedArrayList=ArrayList<Any>()
        myMixedArrayList.add("Memino")
        myMixedArrayList.add(15)
        myMixedArrayList.add(true)
        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])

        println("-----SET-----")

        val myExampleArray=arrayOf(1,1,2,3,4)
        println("Element 1: "+myExampleArray[0])
        println("Element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size)

        //For Each

        mySet.forEach{println(it * 3)}

        val myStringSet = HashSet<String>()
        myStringSet.add("Emin")
        myStringSet.add("Emin")
        myStringSet.size

        //Map - Hashmap

        println("-----MAP-----")
        //Key - Value
        val fruitArray = arrayOf("elma","muz")
        val calories = arrayOf(100,150)
        println("${fruitArray[0]} : ${calories[0]}")

        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Apple",100)
        fruitCalorieMap.put("Banana",150)
        println(fruitCalorieMap["Apple"])

        val myHashmap = HashMap<String,String>()

        val myNewMap=hashMapOf<String,Int>("A" to 1,"B" to 2,"C" to 3)
        println(myNewMap["C"])

        //Operator
        println("-----OPERATOR-----")
        var m = 5
        println(m)
        m=m+1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7
        println(n>m)

        // &&
        // ||
        println(n>m && 1>2)
        println(n>m || 1>2)

        println(10+2)
        println(10-2)
        println(10*2)
        println(10/2)
         //Remainder
        println(10%3)

        // If Control
        println("-----IF CONTROL-----")

        val myAgeNumber = 23
        if(myAgeNumber<20){
            println("< 20")
        } else if (myAgeNumber >= 20 && myAgeNumber < 30){
            println("20 - 30")
        } else if (myAgeNumber >= 30 && myAgeNumber < 40){
            println("30-40")
        } else{
            println(">=40")
        }

        //Switch - When
        println("-----SWITCH-----")

        val day = 3
        var dayString = ""
        /*if(day==1){
            dayString="Monday"
        }else if(day==2){
            dayString = "Tuesday"
        }else if (day == 3){
            dayString = "Wednesday"
        }
        println(dayString) */

        when(day){
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
        }

        //Loops
        // For Loop
        println("-----FOR LOOP-----")
        val myArrayofNumbers = arrayOf(12,15,18,21,24,27,30,33)
        val q = myArrayofNumbers[0] / 3 * 5
        println(q)

        for(number in myArrayofNumbers){
            val z = number / 3 * 5
            println(z)
        }

        for(i in myArrayofNumbers.indices){
            val qz = myArrayofNumbers[i] / 3 * 5
            println(qz)
        }

        for (b in 0..9){
            println(b)
        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Emin")
        myStringArrayList.add("Onur")
        myStringArrayList.add("Burçak")

        for(str in myStringArrayList){
            println(str)
        }

        //While Loop
        println("-----WHILE LOOP-----")
        var j = 0
        while(j<10){
            j = j+1
        }

    }
}