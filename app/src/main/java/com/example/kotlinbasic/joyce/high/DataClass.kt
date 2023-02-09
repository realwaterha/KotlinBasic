package com.example.kotlinbasic.joyce.high

fun main() {
    val ticketA = Ticket("koreanAir", "JinSu", "2023-02-09", 14)
    val ticketB = TicketNormal("koreanAir", "JinSu", "2023-02-09", 14)
    println(ticketA)
    println(ticketB)
}

data class Ticket(val companyName: String, val name: String, var date: String, var seatNumber: Int)

class TicketNormal(val companyName: String, val name: String, var date: String, var seatNumber: Int)