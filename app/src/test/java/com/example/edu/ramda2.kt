package com.example.edu

fun main() {

    //매개변수가 2개 있는 람다식
    moreParam{ a,b -> "Hello World $a, $b"} //매개변수의 이름 생략 불가
}

//매개변수 2개 있는 람다식의 moreParam 함수의 매개변수로 지정됨
fun moreParam(out : (String, String) -> String) {
    println(out("OneParam","TwoParam"))
}