package com.example.kotlinbasic.joyce.high

fun main() {
    val carA = CarFactory.makeCar(10)
    val carB = CarFactory.makeCar(200)
    println(carA)
    println(carB)
    println(CarFactory.cars.size.toString())
}

object CarFactory {
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower: Int): Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower: Int)