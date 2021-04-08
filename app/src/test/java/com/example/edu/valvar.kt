package com.example.edu

fun main() {

    val number = 10
    var language = "Korean"
    val secondNUmber: Int = 20
    language = "English"


    println("number = $number")
    println("language = $language")
    println("secondNumber : $secondNUmber")

    val num05 =127
    val num03 = 329429089089993
    val exp02 = 123L
    val ex03 = 0x0F //접두사 0x -> 16진
    val exp3 = 0b00001011 //0b -> 2진

    val exp2 = 3.14F

    val exp03 = 3.14E-2 //왼쪽으로 소수점 2칸 이동 0.0314
    val exp04 = 3.14e2 //오른쪽으로 소수점 2칸 이동 314(+는 생략가능)

    var num: Double = 0.1

    for(x in 0..999){
        num += 0.1
    }

    println(num)

    println("Byte크기: "+ Byte.MAX_VALUE + Byte.MIN_VALUE)

    val code: Int = 65
    val chFromCode : Char = code.toChar()
    println(chFromCode)


    val ch4 : String = "ab"  //오류가 남 문자열 자료형 string써야함


    var str1 : String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2: ${str1 === str2}")
    println("${str1===str3}")

    var a = 1
    var str5 = "a is ${a}"
    var str6 = "a = ${a+2}"

    println("$str5, \" $str6\" ") //"를 출력하려면 \"으로 쓰면 됨 


    //typealias Username = String
    //val user : Username = "kildong" 오류뜸

    var str11 : String? = "Hello Kotlin" //null값 허용하려면 ?

    str11 = null
    println("str11: $str11")

    //println("${str11!!.length}") //null을 허용하면 실행할 수 없음 //!!. 단정기호도 사용안됨


}