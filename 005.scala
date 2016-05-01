// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

def divisibleBy(num: Int, size: Int) = {
    (size to 1 by -1).forall(num % _ == 0)	
}

val numbers = Iterator.from(1)
val answer = numbers.find(divisibleBy(_,20)).get
println(answer)
