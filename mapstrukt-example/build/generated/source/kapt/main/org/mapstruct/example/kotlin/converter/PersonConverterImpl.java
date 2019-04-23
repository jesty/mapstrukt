package org.mapstruct.example.kotlin.converter;

import javax.annotation.Generated;
import org.mapstruct.example.kotlin.dto.PersonDto;
import org.mapstruct.example.kotlin.model.Person;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-04-19T07:43:02+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class PersonConverterImpl implements PersonConverter {

    @Override
    public PersonDto convertToDto(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDto personDto = new PersonDto();

        personDto.setPhone( person.getPhoneNumber() );
        personDto.setFirstName( person.getFirstName() );
        personDto.setLastName( person.getLastName() );
        personDto.setBirthdate( person.getBirthdate() );

        return personDto;
    }

    @Override
    public Person convertToModel(PersonDto personDto) {
        if ( personDto == null ) {
            return null;
        }

        Person person = new Person();

        person.setPhoneNumber( personDto.getPhone() );
        person.setFirstName( personDto.getFirstName() );
        person.setLastName( personDto.getLastName() );
        person.setBirthdate( personDto.getBirthdate() );

        return person;
    }
}
