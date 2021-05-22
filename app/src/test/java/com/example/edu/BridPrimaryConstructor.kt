package com.example.edu

class Birdd(var name:String, var  wing: Int, var beak: String, var color: String) {

    //var사용으로 _,this,construcotr 생략

    fun fly() = println("Fly wing : $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")

}

fun main() {
    val coco = Bird("Mybird", 2,"short","blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}