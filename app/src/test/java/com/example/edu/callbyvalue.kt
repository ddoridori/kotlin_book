package com.example.edu

fun main() {
    val result = callByvalue(lamda()) //람다식 함수를 호출
    println(result)
}

fun callByvalue(b: Boolean): Boolean {//일반 변수 자료형으로 선언된 매개변수
    println("callby value function")
    return b
 }

val lamda: ( ) -> Boolean = { //람다식 표현이 2종
    println("lamba function")
    true
}//출력