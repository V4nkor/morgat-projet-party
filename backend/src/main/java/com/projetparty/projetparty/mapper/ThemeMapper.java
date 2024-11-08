package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.ThemeDto;
import com.projetparty.projetparty.entity.Theme;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ThemeMapper {
    ThemeDto toDto(Theme theme);
    Theme toEntity(ThemeDto themeDto);
    List<ThemeDto> toDtos(List<Theme> themes);
    List<Theme> toEntities(List<ThemeDto> themeDtos);
}
