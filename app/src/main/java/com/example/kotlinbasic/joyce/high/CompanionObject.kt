package com.example.kotlinbasic.joyce.high

fun main() {
    val book = Book.BookFactory.create()
    val bookId = Book.BookFactory.getId()

    println("${book.id} ${book.name}")
    println(bookId)
}

class Book private constructor(val id: Int, val name: String) {
    companion object BookFactory : IdProvider {
        override fun getId(): Int {
            return 444
        }
        fun create() = Book(0, "animal farm")
    }
}

interface IdProvider {
    fun getId(): Int
}