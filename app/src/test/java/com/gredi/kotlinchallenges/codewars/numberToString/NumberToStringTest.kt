package com.gredi.kotlinchallenges.codewars.numberToString

import junit.framework.TestCase.assertEquals
import org.junit.Test

class NumberToStringTest {
    val sut = NumberToString()
    @Test
    fun testFixed() {
        assertEquals("67", sut.numberToString(67))
        assertEquals("123", sut.numberToString(123))
        assertEquals("999", sut.numberToString(999))
    }
}
