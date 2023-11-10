package com.gredi.kotlinchallenges.smallProjects.bagels

class Bagels {
    val NUM_DIGITS = 3
    val MAX_GUESSES = 10

    fun playGame() {
        // Introdução
        printIntro()
        printSlicer()

        val number = getSecretNum()
        println(number)

        printStart()
        printSlicer()

        for (i in 0 until MAX_GUESSES) {
            val test = readUserInput()

            if(test.length != NUM_DIGITS) {
                printErrorSize()
                continue
            }

            if(test == number) {
                println("Você acertou!")
                break
            } else {
                val clues = checkResponse(test, number)
                printClues(clues)
            }

            println("passou aqui")
        }
    }

    // Print functions
    private fun printIntro() {
        val str = """
            Bagels é um jogo de dedução e lógica.
            Eu vou pensar em um número de $NUM_DIGITS dígitos, sem dígitos repetidos.
            Você tenta adivinhar o que é. Eu vou te dar algumas dicas:
            
            Pico   - Um dígito correto, mas na posição errada.
            Fermi  - Um dígito correto e na posição correta.
            Bagels - Nenhum dígito é correto.
            
            Por exemplo, se eu pensar em 456 e você disser 546, responderei "Fermi Pico".
            O objetivo é adivinhar corretamente em $MAX_GUESSES tentativas.
        """.trimIndent()

        println(str)
    }

    private fun printStart() {
        val str = """
            Eu pensei em um número...
            
            Você tem $MAX_GUESSES tentativas para adivinhar qual é.
        """.trimIndent()

        println(str)
    }

    private fun printErrorSize() {
        val str = "Por favor, digite um número de $NUM_DIGITS dígitos."

        println(str)
    }

    private fun printSlicer() {
        val str = "================================================================"

        println()
        println(str)
        println()
    }

    private fun printClues(clues: Map<Clue, Int>) {
        for (clue in clues) {
            println("${clue.key.value}: ${clue.value}")
        }
    }


    // Game rule functions
    private fun getSecretNum(): String {
        val digits = "0123456789".toMutableList()
        val digitsShuffled = digits.shuffled()

        return digitsShuffled.slice(0 until NUM_DIGITS).joinToString("")
    }

    private fun readUserInput(): String {
        print("> ")
        return readln().replace(" ", "")
    }

    private fun checkResponse(guess: String, secret: String): Map<Clue, Int> {
        var pico = 0
        var fermi = 0

        for (i in guess.indices) {
            if(guess[i] == secret[i]) {
                fermi++
            } else if(secret.contains(guess[i])) {
                pico++
            }
        }

        if(pico == 0 && fermi == 0) {
            return mapOf(Clue.BAGELS to 1)
        }

        return mapOf(
            Clue.PICO to pico,
            Clue.FERMI to fermi,
        )
    }

}
