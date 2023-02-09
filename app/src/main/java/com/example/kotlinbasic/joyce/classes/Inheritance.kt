package com.example.kotlinbasic.joyce.classes

open class InheritanceParent {
    init {
        println("InheritanceParent init")
    }

    open fun sing() {
        println("lalala")
    }
}

open class Korean : InheritanceParent() {
    init {
        println("Korean init")
    }
}

class OverrideFunction : Korean() {
    init {
        println("OverrideFunction init")
    }

    override fun sing() {
        println("owowow")
    }

    fun superSing() {
        super.sing()
    }
}

fun main() {
    val korean = Korean()
    korean.sing()

    val overrideFunction = OverrideFunction()
    overrideFunction.sing()
    overrideFunction.superSing()
}