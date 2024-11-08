package com.projetparty.projetparty.service;

import com.projetparty.projetparty.dto.GameDto;
import com.projetparty.projetparty.entity.Game;
import com.projetparty.projetparty.mapper.GameMapper;
import com.projetparty.projetparty.repository.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {
    private GameRepository gameRepository;
    private GameMapper gameMapper;
    
    public List<GameDto> findAll(Pageable pageable) {
        return gameMapper.toDtos(gameRepository.findAll());
    }

    public GameDto findById(long id) {
        return gameMapper.toDto(gameRepository.findById(id).orElse(null));
    }

    public GameDto save(GameDto gameDto) {
        Game game = gameMapper.toEntity(gameDto);
        return gameMapper.toDto(gameRepository.save(game));
    }

    public GameDto update(Long id, GameDto gameDto) {
        Game existingGame = gameRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Game not found with id " + id));
        gameDto.setId(existingGame.getId());
        Game gameUpdated = gameMapper.toEntity(gameDto);
        return gameMapper.toDto(gameRepository.save(gameUpdated));
    }

    public void delete(Long id) {
        gameRepository.deleteById(id);
    }
}
