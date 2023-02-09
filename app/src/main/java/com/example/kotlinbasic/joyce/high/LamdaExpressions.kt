package com.example.kotlinbasic.joyce.high

fun main() {
    println(square(12))
    println(nameAge("JinSu", 27))

    val a = "joyce said"
    val b = "mac said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("JinSu", 27))

    println(calculateGrade(98))
    println(calculateGrade(971))

    val lamda = { number: Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda{ it > 3.22 })
}

val square: (Int) -> (Int) = { number ->
    number * number
}

val nameAge = { name: String, age: Int ->
    "My name is $name I'm $age"
}

val pizzaIsGreat: String.() -> String = {
    this + "Pizza is the best"
}

fun extendString(name: String, age: Int): String {
    val introduceMySelf: String.(Int) -> String = {
        "I'm $this and $it years old"
    }
    return name.introduceMySelf(age)
}

val calculateGrade: (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

fun invokeLamda(lamda: (Double) -> Boolean): Boolean {
    return lamda(5.2343)
}