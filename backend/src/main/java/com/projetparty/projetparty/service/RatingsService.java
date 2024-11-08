package com.projetparty.projetparty.service;

import com.projetparty.projetparty.dto.RatingDto;
import com.projetparty.projetparty.entity.Rating;
import com.projetparty.projetparty.mapper.RatingMapper;
import com.projetparty.projetparty.repository.RatingRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@Service
@AllArgsConstructor
public class RatingsService {
    private RatingRepository ratingRepository;
    private RatingMapper ratingMapper;
    
    public List<RatingDto> findAll(Pageable pageable) {
        return ratingMapper.toDtos(ratingRepository.findAll());
    }

    public RatingDto findById(long id) {
        return ratingMapper.toDto(ratingRepository.findById(id).orElse(null));
    }

    public RatingDto save(RatingDto ratingDto) {
        Rating rating = ratingMapper.toEntity(ratingDto);
        return ratingMapper.toDto(ratingRepository.save(rating));
    }

    public RatingDto update(Long id, RatingDto ratingDto) {
        Rating existingRating = ratingRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Rating not found with id " + id));
        ratingDto.setId(existingRating.getId());
        Rating ratingUpdated = ratingMapper.toEntity(ratingDto);
        return ratingMapper.toDto(ratingRepository.save(ratingUpdated));
    }

    public void delete(Long id) {
        ratingRepository.deleteById(id);
    }
}
