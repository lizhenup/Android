package com.example.broadcastbestpractice

/*inline   fun num1AndNum2(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    val ret = operation(num1, num2)
    return ret
}

fun plus(num1: Int, num2: Int): Int{
    return num1 + num2
}

fun minus(num1: Int, num2: Int): Int{
    return num1 - num2
}

fun StringBuilder.build(block: StringBuilder.() -> Unit): StringBuilder {
    block()
    return this
}*/
inline fun printString(str: String, block: (String) -> Unit) {
    println("printString start")
    block(str)
    println("printString end")
}

inline fun runRunnable(crossinline block: () -> Unit) {
    val runnable = Runnable {
        block()
    }
    runnable.run()
}
fun main() {
    println("main start")
    val str = ""
    printString(str) { s ->
        println("lambda start")
        if(s.isEmpty()) return
        println(s)
        println("main end")
    }
    println("main end")

    /*val num1 = 100
    val num2 = 50
    //val ret1 = num1AndNum2(num1, num2, ::plus)
    val ret1 = num1AndNum2(num1, num2) {n1, n2 -> n1 + n2}
    println("ret1 is $ret1")
    //val ret2 = num1AndNum2(num1, num2, ::minus)
    val ret2 = num1AndNum2(num1, num2) {n1, n2 -> n1 - n2}
    println("ret2 is $ret2")

    val list = listOf<String>("Apple", "Banana", "Orange", "Pear", "Grape")
    val result = StringBuilder().build {
        append("Start eating fruits \n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruit")
    }
    println(result.toString())*/
}