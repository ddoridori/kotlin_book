package com.example.edu

fun main() {

    val number2 = 5
    println("Factorial : $number2 -> ${factorial2(number2)}")


}

tailrec fun factorial2(s: Int,run: Int =1): Long {
    return if (s == 1) run.toLong() else factorial2(s-1, run*s)
}