package com.example.kotlinbasic.joyce

fun main() {
    nullPoint()
    nonNulls("nonNull", null)
}

fun nullPoint() {
    val name = "JinSu"
    val lastName: String? = null
    val fullName = "$name " + (lastName ?: "No lastName")
    println(fullName)
}

fun nonNulls(strA: String?, strB: String?) {
    val mNonNull: String = strA!!
    println(mNonNull)

    val email: String? = "hbj5656@naver.com"
    email?.let {
        println(email)
    }
    strB?.let {
        println(strB)
    }
}