package com.gredi.kotlinchallenges.codewars.perimeterOfSquaresInARectangle

import java.math.BigInteger

object SumFct {
    fun perimeter(n: Int): BigInteger {
        var sum = BigInteger.valueOf(0)
        var previousNumber = BigInteger.valueOf(1)
        var actualNumber = BigInteger.valueOf(0)

        for (i in 0..n + 1) {
            sum += actualNumber
            actualNumber += previousNumber
            previousNumber = actualNumber - previousNumber
        }

        return sum * BigInteger.valueOf(4)
    }

}