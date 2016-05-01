// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?

def primeFactors(num: Long): List[Long] = {
    val exists = (2L to math.sqrt(num).toLong).find(num % _ == 0)
    exists match {
        case Some(factor) => factor :: primeFactors(num/factor)
        case None => List(num)
    }
}
val answer = primeFactors(600851475143L).max
println(answer)
