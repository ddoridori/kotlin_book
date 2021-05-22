package com.example.edu

fun main() {

    val a: Int
    var b: Int

    a = 10 + 5
    b = 10

    b += a
    println(b)// b = b+a

    b %= 3 // b = b%3 나머지가 출력됨
    println(b)


}