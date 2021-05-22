package com.example.edu

fun main() {

    print (labelBreak())

}

fun labelBreak() {
    println("labelBreak")
    first@ for (i in 1..5) {
        second@ for (j in 1..5){
            if ( j ==3 ) continue@first
            println("i: $i, j:$j")
        }
        println("after for j")
    }//break이후 여기로 옴
    println("after for i")
}

