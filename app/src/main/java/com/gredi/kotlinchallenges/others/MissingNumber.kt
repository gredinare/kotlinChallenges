package com.gredi.kotlinchallenges.others

class MissingNumber {

    // O(n) time complexity
    fun solution1(array: Array<Int>): Int {
        var count = 1
        for (value in array) {
            if(count != value) {
                return count
            }
            count++
        }
        return count
    }

    // O(log n) time complexity
    fun solution2(array: Array<Int>): Int {
        var tempArray = array
        var count = 0

        while (tempArray.size > 1) {
            val mid = tempArray.size / 2
            val list1 = tempArray.sliceArray(0 until mid)
            val list2 = tempArray.sliceArray(mid until tempArray.size)

            list1.forEach { print("$it, ") }
            println()
            list2.forEach { print("$it, ") }

            tempArray = list1
        }

        return array.size + 1
    }

}