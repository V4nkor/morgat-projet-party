package com.projetparty.projetparty.mapper;


import com.projetparty.projetparty.dto.EventDto;
import com.projetparty.projetparty.entity.Event;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AdressMapper.class, ThemeMapper.class, GameMapper.class})
public interface EventMapper {
    EventDto toDto(Event event);
    Event toEntity(EventDto eventDto);
    List<EventDto> toDtos(List<Event> events);
    List<Event> toEntities(List<EventDto> eventDtos);
}
