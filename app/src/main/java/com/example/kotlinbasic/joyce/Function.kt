package com.example.kotlinbasic.joyce

fun main() {
    helloWorld()
    helloWorldSkipUnit()
    println(add(4, 5))
}

fun helloWorld(): Unit {
    println("Hello World !")
}

fun helloWorldSkipUnit() {
    println("Hello World Skip the Unit !")
}

fun add(a: Int, b: Int): Int {
    return a + b
}