package com.tom

fun main() {
    println("Hello World")
    val students = listOf<Student>(
        Student("Joe", 60, 80, 50),
        Student("Joseph", 40, 50, 60),
        Student("Johnson", 70, 90, 70),
        Student("Jackson", 80, 80,90),
    )
}

data class Student(
    val name: String,
    val chinese: Int,
    val english: Int,
    val math: Int ){
    fun print() {
        println("$name\t$chinese\t$english\t$math\t${(chinese + english + math) / 3}\t${grading()}")
    }
    fun grading():String {
        var grading = when ((chinese + english + math) / 3 / 10) {
            in 9..10 -> "A"
            8 -> "B"
            7 -> "C"
            6 -> "D"
            else -> "F"
        }
        return grading
    }
}