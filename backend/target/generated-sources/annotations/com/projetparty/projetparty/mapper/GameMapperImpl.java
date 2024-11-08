package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.GameDto;
import com.projetparty.projetparty.entity.Game;
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
public class GameMapperImpl implements GameMapper {

    @Override
    public GameDto toDto(Game game) {
        if ( game == null ) {
            return null;
        }

        GameDto gameDto = new GameDto();

        gameDto.setId( game.getId() );
        gameDto.setLabel( game.getLabel() );
        gameDto.setPlatform( game.getPlatform() );
        gameDto.setMaxPlayers( game.getMaxPlayers() );

        return gameDto;
    }

    @Override
    public Game toEntity(GameDto gameDto) {
        if ( gameDto == null ) {
            return null;
        }

        Game game = new Game();

        game.setId( gameDto.getId() );
        game.setLabel( gameDto.getLabel() );
        game.setPlatform( gameDto.getPlatform() );
        game.setMaxPlayers( gameDto.getMaxPlayers() );

        return game;
    }

    @Override
    public List<GameDto> toDtos(List<Game> games) {
        if ( games == null ) {
            return null;
        }

        List<GameDto> list = new ArrayList<GameDto>( games.size() );
        for ( Game game : games ) {
            list.add( toDto( game ) );
        }

        return list;
    }

    @Override
    public List<Game> toEntities(List<GameDto> gameDtos) {
        if ( gameDtos == null ) {
            return null;
        }

        List<Game> list = new ArrayList<Game>( gameDtos.size() );
        for ( GameDto gameDto : gameDtos ) {
            list.add( toEntity( gameDto ) );
        }

        return list;
    }
}
