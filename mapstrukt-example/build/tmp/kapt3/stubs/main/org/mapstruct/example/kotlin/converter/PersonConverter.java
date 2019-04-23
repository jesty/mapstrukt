package org.mapstruct.example.kotlin.converter;

import java.lang.System;

@org.mapstruct.Mapper()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\'\u00a8\u0006\b"}, d2 = {"Lorg/mapstruct/example/kotlin/converter/PersonConverter;", "", "convertToDto", "Lorg/mapstruct/example/kotlin/dto/PersonDto;", "person", "Lorg/mapstruct/example/kotlin/model/Person;", "convertToModel", "personDto", "mapstruct-kotlin-gradle"})
public abstract interface PersonConverter {
    
    @org.jetbrains.annotations.NotNull()
    @org.mapstruct.Mapping(source = "phoneNumber", target = "phone")
    public abstract org.mapstruct.example.kotlin.dto.PersonDto convertToDto(@org.jetbrains.annotations.NotNull()
    org.mapstruct.example.kotlin.model.Person person);
    
    @org.jetbrains.annotations.NotNull()
    @org.mapstruct.InheritInverseConfiguration()
    public abstract org.mapstruct.example.kotlin.model.Person convertToModel(@org.jetbrains.annotations.NotNull()
    org.mapstruct.example.kotlin.dto.PersonDto personDto);
}