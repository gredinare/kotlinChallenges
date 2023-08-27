package com.gredi.kotlinchallenges.codewars.oppositesAttract

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class OppositesAttractTest {
    val sut = OppositesAttract()
    @Test
    fun exampleTests() {
        assertTrue(sut.loveFun(1, 4))
        assertFalse(sut.loveFun(2, 2))
        assertTrue(sut.loveFun(0, 1))
        assertFalse(sut.loveFun(0, 0))
    }
}