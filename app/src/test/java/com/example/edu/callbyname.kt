package com.example.edu

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean):Boolean{ //람다식 자료형으로 선언된 매개변수
    println("callbyValue")
    return b()
}

val otherLambda : () -> Boolean = {
    println("other lambda function")
    true
}