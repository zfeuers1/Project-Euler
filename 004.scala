// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.

def isPalindrome(num: Int): Boolean = {
    val numString = num.toString
    numString == numString.reverse
}

val palindromes = for (a <- 100 until 999; b <- 100 until 999 if(isPalindrome(a * b))) yield a * b 
val answer = palindromes.max
println(answer)
