package com.example.edu

fun main() {
    //매개변수 없는 람다식
    noParam({"Hello World!"})
    noParam{"Hello world!"} //()생략가능
}

//매개변수가 없는 람다식이 noParam 함수의 매개변수 out으로 지정됨
fun noParam(out: () -> String) = println(out())
