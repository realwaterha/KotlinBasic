package com.example.kotlinbasic.joyce

fun main() {
    forList()
    whileIndex()
}

fun forList() {
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")
    for (name in students) {
        println(name)
    }

    var sum = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)

    for (j in 1..10 step 2) {
        println("j : $j")
    }

    for (k in 10 downTo 1) {
        println("k : $k")
    }

    for (q in 1 until 10) {
        println("q : $q")
    }

    for ((index, name) in students.withIndex()) {
        println("students index ${index + 1} : $name")
    }
}

fun whileIndex() {
    var index = 0
    while (index < 10) {
        println("index : $index")
        index++
    }
}
