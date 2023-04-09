/*
Create a function that takes a nullable Int and returns its double only if the value is not null. Otherwise, return a default value of 0.

Write a function that takes a nullable List<String> and prints the length of the list only if it's not null.

Create a data class with nullable properties, and use the let function to perform operations on non-null properties only.
 */

fun main() {
    fun one(num: Int? ) = (num?.times(2)) ?: 0
    fun two(nullList: List<String>? ) = nullList?.size
}