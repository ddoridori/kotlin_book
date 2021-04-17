package com.example.edu

fun main() {

    oneParam { a-> "Hello world $a" }
    oneParam { "hello $it" } //it으로 대체 가능

}
//매개변수가 1개 있는 람다식이 oneParam()함수의 매개변수 out으로 지정됨
fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}