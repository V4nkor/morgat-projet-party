package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.MessageDto;
import com.projetparty.projetparty.entity.Message;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MessageMapper {
    MessageDto toDto(Message message);
    Message toEntity(MessageDto messageDto);
    List<MessageDto> toDtos(List<Message> messages);
    List<Message> toEntities(List<MessageDto> messageDtos);
}
