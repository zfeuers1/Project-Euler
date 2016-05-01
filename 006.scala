// The sum of the squares of the first ten natural numbers is,

// 1^2 + 2^2 + ... + 10^2 = 385
// The square of the sum of the first ten natural numbers is,

// (1 + 2 + ... + 10)^2 = 55^2 = 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


// both below work. second is better since it isnt storing he entire map
// val sumOfSquares = (1 to 100).map(n => n * n).sum
val sumOfSquares = (1 to 100).foldLeft(0)((a, b) => a + b*b)

val sums = (1 to 100).sum
val squareOfSums = sums * sums
val answer = squareOfSums - sumOfSquares
println(answer)
