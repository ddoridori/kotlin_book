package com.example.edu

fun main() {

    val a:Byte = 125
    val b:Short = (100 + 200) * 100
    var c:Int = 12_4354_6538
    c = 0xFF_88_88 //16진수로 인식
    c = 0b01010010_01100011_01110101_01000101 //2진수로 인식
    var d:Long = -543_7847_3984_7238_4723

    c = a+b
    d = c+10L
    var e: Float = 67.6f
    val f: Double = 658.456
    e = (e+f).toFloat()
    println(e)
}