package com.memino.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var myTextView : TextView
    private lateinit var myButton : Button
    private lateinit var nameText : EditText
    private lateinit var ageText : EditText
    private lateinit var jobText : EditText
    var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView=findViewById(R.id.textView)
        myButton=findViewById(R.id.button)
        nameText=findViewById(R.id.nameText)
        ageText=findViewById(R.id.ageText)
        jobText=findViewById(R.id.jobText)

        /*
        myButton.setOnClickListener{
            myTextView.text="Button Clicked2"
        }

         */
        // 1) Code block, reusable 2) Input 3) Output - Return

        test()
        mySum(10,15)
        val sumResult = mySum(40,35)
        val result = myMultiply(10,20)

        //Class
        val homer = Simpson("Homer",50,"Nuclear")
        println(homer.name)

        //Nullability
        var myString : String? = null //Boş değer alabiliyor artık ? ile.
        println(myString)

        var myAge : Int? = null
        myAge = 50
        // !! ?
        //1) !!
        //println(myAge!! * 50) //Kesinlikle null değil işlemi yap demek ama uygulama çöker

        //2) safe call
        println(myAge?.minus(10))

        //3)
        if (myAge != null){
            println(myAge.minus(10))
        }else{
            println("myAge is null")
        }

        //4)elvis operator
        println(myAge?.minus(10)?: -10)

        //5)
        myAge?.let {
            println(it*10)
        }


    }

    fun test(){
        println("test function")
    }

    fun mySum(a : Int, b : Int){

    }

    fun myMultiply(a:Int,b:Int) : Int {
        //println(a*b)
        val result=a*b
        myTextView.text="Result: ${result}"
        return a*b
    }

    fun buttonClicked(view : View){
        name = nameText.text.toString()
        val age = ageText.text.toString().toIntOrNull() //Yanlış tipte girilirse null girer
        val job = jobText.text.toString()
        if(age!=null){
            val simpson = Simpson(name, age, job)

            myTextView.text = "Name: ${simpson.name} Age: ${simpson.age} Job: ${simpson.job}"
        }else{
            myTextView.text = "Enter your age!"
        }



    }

}