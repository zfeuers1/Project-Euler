// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.


// old way i would have built the code
var sum = 0
for (number <- 0 until 1000; if (number % 3 == 0) || (number % 5 == 0))
	sum += number
println(sum)


// new more scala way to write code
val sum_of_multiples = (0 until 1000).filter(number => number % 3 == 0 || number % 5 == 0).sum
println(sum_of_multiples)
