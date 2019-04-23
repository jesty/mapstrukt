package com.github.jesty

import org.mapstruct.example.kotlin.dto.PersonDto
import org.mapstruct.example.kotlin.model.Person

object Mapstrukt {
    fun org.mapstruct.example.kotlin.model.Person.convertToDto(): PersonDto = org.mapstruct.factory.Mappers.getMapper(org.mapstruct.example.kotlin.converter.PersonConverter::class.java).convertToDto(this)

    fun org.mapstruct.example.kotlin.dto.PersonDto.convertToModel(): Person = org.mapstruct.factory.Mappers.getMapper(org.mapstruct.example.kotlin.converter.PersonConverter::class.java).convertToModel(this)
}
