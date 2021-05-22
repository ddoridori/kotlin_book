package com.example.edu

fun main() {

    shortFunc(3) {
        println("first call: $it")
        return
    }
}

inline fun shortFunc(a:Int, out: (Int) -> Unit){
    println("Before calling out ( )")
    out(a)
    println("After calling out( )")
}
