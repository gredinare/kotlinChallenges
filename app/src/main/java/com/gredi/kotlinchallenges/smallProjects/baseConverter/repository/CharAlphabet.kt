package com.gredi.kotlinchallenges.smallProjects.baseConverter.repository

/**
 * Class that contains the chars to be used for each base.
 */
object CharAlphabet {
    private val alphabet: Array<Char> = arrayOf(
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z')

    /**
     * Return array of chars valid for the given base.
     *
     * @param base The base to get the chars.
     * base can be (2 ~ 36).
     */
    fun getCharsPerBase(base: Int): Array<Char> {
        return alphabet.sliceArray(0 until base)
    }
}
