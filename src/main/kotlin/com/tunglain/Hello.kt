package com.tunglain

fun main(args: Array<String>) {
//    println("Hello kotlin ")
//    Human().hello()
    val h = Human()
    h.hello()
    val age : Int = 19
    var age2 = 20
    age2 = 23
    var weight = 66.5f
    val name  = "steven"
    val name2 : String
    name2 = "peter"
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}