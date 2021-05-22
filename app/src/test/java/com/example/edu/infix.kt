package com.example.edu

fun main() {
    //일반 표현법
    //val multi = 3.multiply(4ß0)
    val multi = 3 multifly 40
    println("multi : $multi")

}

//int 확장해서 multiply()함수 추가
infix fun Int.multifly(x:Int) :Int {//infix로 선언되므로 중위함수
    return this * x

}