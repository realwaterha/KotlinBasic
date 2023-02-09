package com.example.kotlinbasic.joyce

fun main() {
    array()
}

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)
    val anyArray = arrayOf(1, 2, "w")
    val anyList = listOf(1, 2, "f")
    println(array[0])
    println(list[0])
    println(anyArray[2])
    println(anyList[2])

    array[0] = 3
    println(array[0])

    val result = list[0]
    println(result)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    println(arrayList[0])

    arrayList[0] = 40
    println(arrayList[0])
}