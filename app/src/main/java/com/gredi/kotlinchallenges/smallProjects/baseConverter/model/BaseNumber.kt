package com.gredi.kotlinchallenges.smallProjects.baseConverter.model

/**
 * Class that represents a number in a given base.
 *
 * @param number The number to be converted.
 * @param base The base of the number.
 */
data class BaseNumber(
    val number: String,
    val base: Int
)
