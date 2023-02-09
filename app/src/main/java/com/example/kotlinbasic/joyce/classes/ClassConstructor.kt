package com.example.kotlinbasic.joyce.classes

class Human constructor(str: String) {
    val name = str
    fun eatingCake() {
        println("YUMMY ~!")
    }
}

class Dog constructor(val name: String) {
    fun looks() {
        println("Cute ~!")
    }
}

class NullConstructor constructor(val name: String = "Anonymous") {
    fun naming() {
        println("default is Anonymous")
    }
}

class SkipConstructor(val name: String) {
    init {
        println("default Start init")
    }
}

class MultipleConstructor(val name: String) {
    constructor(name: String, age: Int) : this(name) {
        println("My name is $name, $age years old")
    }
}

fun main() {
    val human = Human("JinSu")
    human.eatingCake()
    println("this human's name is ${human.name} \n")

    val dog = Dog("Fow")
    dog.looks()
    println("this dog's name is ${dog.name} \n")

    val nullConstructor = NullConstructor()
    nullConstructor.naming()
    println("this class's name is ${nullConstructor.name} \n")

    val skipConstructor = SkipConstructor("Skip")
    println("${skipConstructor.name} \n")

    val multipleConstructor = MultipleConstructor("JinSu", 27)
    println(multipleConstructor.name)
}