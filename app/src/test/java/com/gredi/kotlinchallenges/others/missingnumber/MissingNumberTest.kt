package com.gredi.kotlinchallenges.others.missingnumber

import junit.framework.TestCase.assertEquals
import org.junit.Test

class MissingNumberTest {
    private val sut = MissingNumber()

    @Test
    fun `when give order array return missing number`() {
        val array = arrayOf(1, 2, 3, 5)

        val result = sut.solution1(array)

        val expected = 4
        assertEquals(result, expected)
    }
}
