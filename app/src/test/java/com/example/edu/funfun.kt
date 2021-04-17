package com.example.edu

fun main() {
    println("funcfunc : ${funFunc()}")

}

fun sum(a:Int, b: Int) = a + b

fun funFunc() : Int {//함수의 반환값으로 함수 사용
    return sum(2,2)



 }