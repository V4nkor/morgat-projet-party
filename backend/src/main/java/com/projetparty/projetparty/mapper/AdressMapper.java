package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.AdressDto;
import com.projetparty.projetparty.entity.Adress;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdressMapper {
    AdressDto toDto(Adress adress);
    Adress toEntity(AdressDto adressDto);
    List<AdressDto> toDtos(List<Adress> adresss);
    List<Adress> toEntities(List<AdressDto> adressDtos);
}
