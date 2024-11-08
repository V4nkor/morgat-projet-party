package com.projetparty.projetparty.service;

import com.projetparty.projetparty.dto.MessageDto;
import com.projetparty.projetparty.entity.Message;
import com.projetparty.projetparty.mapper.MessageMapper;
import com.projetparty.projetparty.repository.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@Service
@AllArgsConstructor
public class MessageService {
    private MessageRepository messageRepository;
    private MessageMapper messageMapper;
    
    public List<MessageDto> findAll(Pageable pageable) {
        return messageMapper.toDtos(messageRepository.findAll());
    }

    public MessageDto findById(long id) {
        return messageMapper.toDto(messageRepository.findById(id).orElse(null));
    }

    public MessageDto save(MessageDto messageDto) {
        Message message = messageMapper.toEntity(messageDto);
        return messageMapper.toDto(messageRepository.save(message));
    }

    public MessageDto update(Long id, MessageDto messageDto) {
        Message existingMessage = messageRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Message not found with id " + id));
        messageDto.setId(existingMessage.getId());
        Message messageUpdated = messageMapper.toEntity(messageDto);
        return messageMapper.toDto(messageRepository.save(messageUpdated));
    }

    public void delete(Long id) {
        messageRepository.deleteById(id);
    }
}
