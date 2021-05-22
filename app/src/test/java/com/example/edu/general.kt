package com.example.edu

fun main() {
    twoLambda({a,b -> " First $a, $b"}, { "Second $it"})
    twoLambda({a, b -> "First $a, $b"}) {"Second $it"}
}

fun twoLambda(first: (String, String) -> String, second : (String) -> String) {
    println(first("OneParam","TwoParam"))
    println(second("Onepparam"))
}