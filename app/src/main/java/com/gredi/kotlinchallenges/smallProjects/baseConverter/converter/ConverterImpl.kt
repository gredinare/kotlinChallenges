package com.gredi.kotlinchallenges.smallProjects.baseConverter.converter

import com.gredi.kotlinchallenges.smallProjects.baseConverter.model.BaseNumber
import com.gredi.kotlinchallenges.smallProjects.baseConverter.repository.CharAlphabet
import kotlin.math.pow

class ConverterImpl: Converter {
    override fun convert(input: BaseNumber, outputBase: Int): BaseNumber {
        val decimal = anyBaseToDecimal(input)
        return decimalToAnyBase(decimal, outputBase)
    }

    private fun anyBaseToDecimal(input: BaseNumber): Int {
        val digits = CharAlphabet.getCharsPerBase(input.base)
        val reversedNumber = input.number.reversed()
        val power = input.base
        var remainder: Int
        var output = 0

        for (i in reversedNumber.indices) {
            remainder = digits.indexOf(reversedNumber[i])
            output += remainder * power.toDouble().pow(i.toDouble()).toInt()
        }

        return output
    }

    private fun decimalToAnyBase(input: Int, outputBase: Int): BaseNumber {
        val digits = CharAlphabet.getCharsPerBase(outputBase)
        var quotient = input
        var remainder: Int
        var number = ""

        while (quotient != 0) {
            remainder = quotient % outputBase
            quotient /= outputBase
            number += digits[remainder]
        }

        return BaseNumber(number.reversed(), outputBase)
    }
}