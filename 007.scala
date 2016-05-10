// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?

// run and iterator and find number where 

def isPrime(num: Int): Boolean = {
    !(2 to math.sqrt(num).toInt).exists(num % _ == 0)
}

def nextPrime(num: Int) = {
    Iterator.from(num + 1).find(isPrime).get	
}

val primes = Iterator.iterate(2)(nextPrime);
val answer = primes.drop(10000).next
println(answer)
