package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.RatingDto;
import com.projetparty.projetparty.entity.Rating;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RatingMapper {
    RatingDto toDto(Rating rating);
    Rating toEntity(RatingDto ratingDto);
    List<RatingDto> toDtos(List<Rating> ratings);
    List<Rating> toEntities(List<RatingDto> ratingDtos);
}
