import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.example.kotlin.dto.PersonDto;
import org.mapstruct.example.kotlin.model.Person;

@Mapper
interface PersonConverter {

    @Mapping(source = "phoneNumber", target = "phone")
    PersonDto convertToDto(Person person);

    @InheritInverseConfiguration
    Person convertToModel(PersonDto personDto);

}
