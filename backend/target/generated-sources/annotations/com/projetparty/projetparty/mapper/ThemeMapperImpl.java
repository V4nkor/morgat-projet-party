package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.ThemeDto;
import com.projetparty.projetparty.entity.Theme;
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
public class ThemeMapperImpl implements ThemeMapper {

    @Override
    public ThemeDto toDto(Theme theme) {
        if ( theme == null ) {
            return null;
        }

        ThemeDto themeDto = new ThemeDto();

        themeDto.setId( theme.getId() );
        themeDto.setType( theme.getType() );
        themeDto.setLabel( theme.getLabel() );
        themeDto.setMaxPlayers( theme.getMaxPlayers() );

        return themeDto;
    }

    @Override
    public Theme toEntity(ThemeDto themeDto) {
        if ( themeDto == null ) {
            return null;
        }

        Theme theme = new Theme();

        theme.setId( themeDto.getId() );
        theme.setType( themeDto.getType() );
        theme.setLabel( themeDto.getLabel() );
        theme.setMaxPlayers( themeDto.getMaxPlayers() );

        return theme;
    }

    @Override
    public List<ThemeDto> toDtos(List<Theme> themes) {
        if ( themes == null ) {
            return null;
        }

        List<ThemeDto> list = new ArrayList<ThemeDto>( themes.size() );
        for ( Theme theme : themes ) {
            list.add( toDto( theme ) );
        }

        return list;
    }

    @Override
    public List<Theme> toEntities(List<ThemeDto> themeDtos) {
        if ( themeDtos == null ) {
            return null;
        }

        List<Theme> list = new ArrayList<Theme>( themeDtos.size() );
        for ( ThemeDto themeDto : themeDtos ) {
            list.add( toEntity( themeDto ) );
        }

        return list;
    }
}
