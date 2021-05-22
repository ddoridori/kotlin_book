package com.example.edu

fun main() {
    val source = "Hello world"
    var targetd = "Kotlin kotlin kotlin"
    println(source.getLongString(targetd))

}

fun String.getLongString(target: String):String =
        if (this.length > target.length) this else target