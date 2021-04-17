package com.example.edu

fun main() {

    //1. 인자와 반환값이 있는 함수
    val res1 = funcParam(3,2,::sum1) //sum과 funcParam()의 매개변수c의 인자수와 자료형의 개수 동일
    println(res1)

    //2. 인지가 없는 함수
    hello(::text) //반환값이 없음
    //같은표현 hello({ a,b -> text(a,b)})
    //hello{ a,b -> text(a,b) }

    //3. 일반 변수에 값처럼 할당
    val likeLambda = ::sum1
    println(likeLambda(6,6))
}

fun sum1(a: Int, b: Int) = a+b

fun text(a: String, b: String)  = "Hi! $a $b"

fun funcParam(a:Int,b: Int, c: (Int, Int) -> Int): Int {
    return c(a,b)
}

fun hello(body: (String, String) -> String): Unit{
    println(body("Hello","World"))
}