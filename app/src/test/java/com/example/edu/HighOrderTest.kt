package com.example.edu

fun main() {
    var result: Int

    val multi: (Int, Int) -> Int = {x:Int,y:Int -> x * y} //full

    result = multi(10,20) //람다식이 할당된 변수는 함수처럼 사용 가능
    println(result)

}