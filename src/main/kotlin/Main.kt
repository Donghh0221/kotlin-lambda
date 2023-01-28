fun main() {
    val numbers = listOf(1, 2, 3, 4)

    //with for loop
    var resultWithForLoop = 1
    for (number in numbers) {
        resultWithForLoop *= number
    }
    println(resultWithForLoop)

    // with forEach
    var resultWithForEach = 1
    numbers.forEach { resultWithForEach *= it }
    println(resultWithForEach)

    val resultWithFold = numbers.fold(1) { result, next -> result * next }
    println(resultWithFold)
}
