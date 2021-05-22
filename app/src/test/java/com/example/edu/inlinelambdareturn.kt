package com.example.edu

fun main() {
    retFunc()
    greet()()
}

fun inlineLambda(a: Int, b: Int, out : (Int, Int) -> Unit) { //inline제거
    out(a,b)
}

fun retFunc(){
    println("start of retFunc")
    inlineLambda(13,3, fun(a,b){ //익명함수를 사용한 반환
        val result = a + b
        if (result > 10) return
        println("result : $result")
    }) //inlineLambda의 반환

    println("end of retFunc") //이부분이 실행


}

fun greet() = fun (){ println("hello")}