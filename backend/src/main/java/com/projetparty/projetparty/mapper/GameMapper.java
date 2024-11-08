package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.GameDto;
import com.projetparty.projetparty.entity.Game;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GameMapper {
    GameDto toDto(Game game);
    Game toEntity(GameDto gameDto);
    List<GameDto> toDtos(List<Game> games);
    List<Game> toEntities(List<GameDto> gameDtos);
}
