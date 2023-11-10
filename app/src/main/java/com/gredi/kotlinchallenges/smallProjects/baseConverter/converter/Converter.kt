package com.gredi.kotlinchallenges.smallProjects.baseConverter.converter

import com.gredi.kotlinchallenges.smallProjects.baseConverter.model.BaseNumber

interface Converter {
    fun convert(input: BaseNumber, outputBase: Int): BaseNumber
}