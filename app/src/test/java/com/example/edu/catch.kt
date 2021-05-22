package com.example.edu

import java.lang.ArithmeticException
import java.lang.Exception

fun main() {

    val a = 6
    val b = 0
    val c : Int

    try {
        c = a/b
    }
    catch (e: Exception){
        println("exception in handled ${e.message}")
        e.printStackTrace()
    }
    finally {
        println("finally is always going")
    }
}



