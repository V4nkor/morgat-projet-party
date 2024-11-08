package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.AdressDto;
import com.projetparty.projetparty.entity.Adress;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-08T11:22:07+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class AdressMapperImpl implements AdressMapper {

    @Override
    public AdressDto toDto(Adress adress) {
        if ( adress == null ) {
            return null;
        }

        AdressDto adressDto = new AdressDto();

        adressDto.setId( adress.getId() );
        adressDto.setStreet( adress.getStreet() );
        adressDto.setCity( adress.getCity() );
        adressDto.setRegion( adress.getRegion() );
        adressDto.setCountry( adress.getCountry() );

        return adressDto;
    }

    @Override
    public Adress toEntity(AdressDto adressDto) {
        if ( adressDto == null ) {
            return null;
        }

        Adress adress = new Adress();

        adress.setId( adressDto.getId() );
        adress.setStreet( adressDto.getStreet() );
        adress.setCity( adressDto.getCity() );
        adress.setRegion( adressDto.getRegion() );
        adress.setCountry( adressDto.getCountry() );

        return adress;
    }

    @Override
    public List<AdressDto> toDtos(List<Adress> adresss) {
        if ( adresss == null ) {
            return null;
        }

        List<AdressDto> list = new ArrayList<AdressDto>( adresss.size() );
        for ( Adress adress : adresss ) {
            list.add( toDto( adress ) );
        }

        return list;
    }

    @Override
    public List<Adress> toEntities(List<AdressDto> adressDtos) {
        if ( adressDtos == null ) {
            return null;
        }

        List<Adress> list = new ArrayList<Adress>( adressDtos.size() );
        for ( AdressDto adressDto : adressDtos ) {
            list.add( toEntity( adressDto ) );
        }

        return list;
    }
}
