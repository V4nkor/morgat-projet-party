package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.EventDto;
import com.projetparty.projetparty.dto.GameDto;
import com.projetparty.projetparty.entity.Event;
import com.projetparty.projetparty.entity.Game;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-08T16:31:41+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Autowired
    private AdressMapper adressMapper;
    @Autowired
    private ThemeMapper themeMapper;
    @Autowired
    private GameMapper gameMapper;

    @Override
    public EventDto toDto(Event event) {
        if ( event == null ) {
            return null;
        }

        EventDto eventDto = new EventDto();

        eventDto.setId( event.getId() );
        eventDto.setName( event.getName() );
        eventDto.setDescription( event.getDescription() );
        eventDto.setStartDate( event.getStartDate() );
        eventDto.setStartTime( event.getStartTime() );
        eventDto.setIsFree( event.getIsFree() );
        eventDto.setPrice( event.getPrice() );
        eventDto.setReservedNb( event.getReservedNb() );
        eventDto.setMaxNb( event.getMaxNb() );
        eventDto.setSuppliesNeeded( event.isSuppliesNeeded() );
        eventDto.setTheme( themeMapper.toDto( event.getTheme() ) );
        eventDto.setAdress( adressMapper.toDto( event.getAdress() ) );
        eventDto.setGames( gameSetToGameDtoList( event.getGames() ) );

        return eventDto;
    }

    @Override
    public Event toEntity(EventDto eventDto) {
        if ( eventDto == null ) {
            return null;
        }

        Event event = new Event();

        event.setId( eventDto.getId() );
        event.setName( eventDto.getName() );
        event.setDescription( eventDto.getDescription() );
        event.setStartDate( eventDto.getStartDate() );
        event.setStartTime( eventDto.getStartTime() );
        event.setIsFree( eventDto.getIsFree() );
        event.setPrice( eventDto.getPrice() );
        event.setReservedNb( eventDto.getReservedNb() );
        event.setMaxNb( eventDto.getMaxNb() );
        event.setSuppliesNeeded( eventDto.isSuppliesNeeded() );
        event.setTheme( themeMapper.toEntity( eventDto.getTheme() ) );
        event.setAdress( adressMapper.toEntity( eventDto.getAdress() ) );
        event.setGames( gameDtoListToGameSet( eventDto.getGames() ) );

        return event;
    }

    @Override
    public List<EventDto> toDtos(List<Event> events) {
        if ( events == null ) {
            return null;
        }

        List<EventDto> list = new ArrayList<EventDto>( events.size() );
        for ( Event event : events ) {
            list.add( toDto( event ) );
        }

        return list;
    }

    @Override
    public List<Event> toEntities(List<EventDto> eventDtos) {
        if ( eventDtos == null ) {
            return null;
        }

        List<Event> list = new ArrayList<Event>( eventDtos.size() );
        for ( EventDto eventDto : eventDtos ) {
            list.add( toEntity( eventDto ) );
        }

        return list;
    }

    protected List<GameDto> gameSetToGameDtoList(Set<Game> set) {
        if ( set == null ) {
            return null;
        }

        List<GameDto> list = new ArrayList<GameDto>( set.size() );
        for ( Game game : set ) {
            list.add( gameMapper.toDto( game ) );
        }

        return list;
    }

    protected Set<Game> gameDtoListToGameSet(List<GameDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<Game> set = new LinkedHashSet<Game>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( GameDto gameDto : list ) {
            set.add( gameMapper.toEntity( gameDto ) );
        }

        return set;
    }
}
