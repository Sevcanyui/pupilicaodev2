package Ders1

fun main() {
    println(convertToFahrenheit(25.0))          // 77.0
    println(rectanglePerimeter(5.0, 10.0))       // 30.0
    println(factorial(5))                        // 120
    println(countA("araba"))                     // 3
}

// 1. Dereceyi Fahrenheit'a çeviren metod
fun convertToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

// 2. Dikdörtgenin çevresini hesaplayan metod
fun rectanglePerimeter(length: Double, width: Double): Double {
    return 2 * (length + width)
}

// 3. Sayının faktöriyelini hesaplayan metod
fun factorial(number: Int): Int {
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}

// 4. Kelime içinde kaç tane 'a' harfi olduğunu bulan metod
fun countA(word: String): Int {
    return word.count { it == 'a' || it == 'A' }
}