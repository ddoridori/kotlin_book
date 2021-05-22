package com.example.edu

class Bird1 {

    var name1: String
    var wing1: Int
    var beak1:String
    var color1:String

    constructor(name1:String, wing1:Int, beak1:String, color1:String){
        this.name1 = name1
        this.wing1 = wing1
        this.beak1 = beak1
        this.color1 = color1
    }

    fun fly() = println("Fly wing: $wing1")
    fun sing1(vol1:Int) = println("Sing vol: $vol1")



}

fun main() {
    val coco1 = Bird1("mybird",2,"short","blue")

    coco1.color1 = "yellow"
    println("cocolcolor: ${coco1.color1}")
    coco1.fly()
    coco1.sing1(4)
}