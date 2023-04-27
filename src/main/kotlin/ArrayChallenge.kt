/*
Now the challenge is to create the function which is going to take as an argument, an array of integers.

Then you need to figure out a way to determine which number is the biggest number in that array.

Then you need to return that number to the function and you need to create another function which is

going to do the same thing, but is going to figure out what is the minimum number stored in that array

and then is going to return that value.

And third, you need to find a way to combine those two function in just one function, which is going

to return the maximum value stored in that array if you want, or if you don't want it to return the

minimum value.
 */

fun main() {

    /* fun maxNum (numbers: Array<Int>) = numbers.max()
    fun minNum (numbers: Array<Int>) = numbers.min()

    val max = maxNum(arrayOf(1, 5, 9, 25, 6, 8890))
    val min = minNum(arrayOf(45, 5, 56, 3, 1, -8))

    println("The Max value is: $max")
    println("The Min value is: $min") */

    fun digitize(n:Long)= n.toString().split("").filter { it.isNotEmpty() }.map { it.toInt() }.reversed().toIntArray()

    print(digitize(35231))


}