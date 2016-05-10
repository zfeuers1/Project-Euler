/*

A Pythagorean triplet is a set of three natural numbers, when a is less than b and b is less than c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/

def isTriplet(a: Int, b: Int, c: Int, sum: Int): Boolean = {
    (a * a) + (b * b) == (c * c) && (a + b + c) == sum && a < b && b < c
}

def triplet(sum: Int) = {
	val triplets = 
	    for(a <- 1 to sum; 
        b <- 1 to (sum - a); 
        c <- 1 to (sum - a - b) if isTriplet(a, b, c, sum)) yield (a,b,c)
    if (!triplets.isEmpty) triplets.head
    else (0,0,0)
}

val tripletSolution = triplet(1000)
println(tripletSolution)
val answer = tripletSolution._1 * tripletSolution._2 * tripletSolution._3
println(answer)
