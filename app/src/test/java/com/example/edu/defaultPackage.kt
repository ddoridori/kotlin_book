package com.example.edu

import kotlin.math.PI
import kotlin.math.abs

import com.example.people.Person as User

fun main() {
    val intro : String = "안녕하세요!"
    val num : Int = 20

    println("intro : $intro, num : $num")

    println(PI)
    println(abs(-12.6))

    val user1 = User("kildong",30)
    val user2 = Person("A123","Kildong")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)





}

class Person(val id: String, val name : String)
