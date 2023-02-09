package com.example.kotlinbasic.joyce

fun main() {
//    println(maxBy(5, 2))
    println(minBy(10, 7))

    println(scoreWhen(20))
    println(scoreWhen(50))
}

//fun maxBy(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}

fun minBy(a: Int, b: Int) = if (a > b) b else a

fun scoreWhen(score: Int) {
    when (score) {
        10 -> println("input : 10")
        20 -> println("input : 20")
        30 -> println("input : 30")
        else -> println("input : $score")
    }

    val i = when (score) {
        10 -> 20
        20 -> 30
        30 -> 40
        else -> score + 10
    }

    println("$score + 10 = $i")

    when (i) {
        in 10..20 -> println("input 10 ~ 20")
        in 21..30 -> println("input 21 ~ 30")
        in 31..40 -> println("input 31 ~ 40")
        else -> println("input 0 ~ 9 or 40 ~")
    }
}