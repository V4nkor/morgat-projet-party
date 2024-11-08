package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.MessageDto;
import com.projetparty.projetparty.entity.Message;
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
public class MessageMapperImpl implements MessageMapper {

    @Override
    public MessageDto toDto(Message message) {
        if ( message == null ) {
            return null;
        }

        MessageDto messageDto = new MessageDto();

        messageDto.setId( message.getId() );
        messageDto.setContent( message.getContent() );
        messageDto.setDate( message.getDate() );
        messageDto.setTime( message.getTime() );

        return messageDto;
    }

    @Override
    public Message toEntity(MessageDto messageDto) {
        if ( messageDto == null ) {
            return null;
        }

        Message message = new Message();

        message.setId( messageDto.getId() );
        message.setContent( messageDto.getContent() );
        message.setDate( messageDto.getDate() );
        message.setTime( messageDto.getTime() );

        return message;
    }

    @Override
    public List<MessageDto> toDtos(List<Message> messages) {
        if ( messages == null ) {
            return null;
        }

        List<MessageDto> list = new ArrayList<MessageDto>( messages.size() );
        for ( Message message : messages ) {
            list.add( toDto( message ) );
        }

        return list;
    }

    @Override
    public List<Message> toEntities(List<MessageDto> messageDtos) {
        if ( messageDtos == null ) {
            return null;
        }

        List<Message> list = new ArrayList<Message>( messageDtos.size() );
        for ( MessageDto messageDto : messageDtos ) {
            list.add( toEntity( messageDto ) );
        }

        return list;
    }
}
