package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.InterestDto;
import com.projetparty.projetparty.entity.Interest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InterestMapper {
    InterestDto toDto(Interest interest);
    Interest toEntity(InterestDto interestDto);
    List<InterestDto> toDtos(List<Interest> interests);
    List<Interest> toEntities(List<InterestDto> interestDtos);
}
