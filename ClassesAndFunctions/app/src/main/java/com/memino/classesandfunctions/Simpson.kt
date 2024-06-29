package com.memino.classesandfunctions

//Primary Constructor
class Simpson(var name:String,var age:Int, var job:String) {
    //Parantez dışı optional olur. Üsttekiler zorunlu.
    private var height = 0

    fun setHeight(num : Int){
        if (num>100){
            height = num
        }
    }

    /*
    //Property
    var name = ""
    var age = 0
    var job = ""

    //Constructor
    constructor(name:String,age:Int,job:String){
        println("Constructor Executed")
        this.name=name
        this.age=age
        this.job=job
    }
     */

}