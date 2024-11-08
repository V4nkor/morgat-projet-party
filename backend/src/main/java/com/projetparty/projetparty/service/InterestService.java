package com.projetparty.projetparty.service;

import com.projetparty.projetparty.dto.InterestDto;
import com.projetparty.projetparty.entity.Interest;
import com.projetparty.projetparty.mapper.InterestMapper;
import com.projetparty.projetparty.repository.InterestRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@Service
@AllArgsConstructor
public class InterestService {
    private InterestRepository interestRepository;
    private InterestMapper interestMapper;
    
    public List<InterestDto> findAll(Pageable pageable) {
        return interestMapper.toDtos(interestRepository.findAll());
    }

    public InterestDto findById(long id) {
        return interestMapper.toDto(interestRepository.findById(id).orElse(null));
    }

    public InterestDto save(InterestDto interestDto) {
        Interest interest = interestMapper.toEntity(interestDto);
        return interestMapper.toDto(interestRepository.save(interest));
    }

    public InterestDto update(Long id, InterestDto interestDto) {
        Interest existingInterest = interestRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Interest not found with id " + id));
        interestDto.setId(existingInterest.getId());
        Interest interestUpdated = interestMapper.toEntity(interestDto);
        return interestMapper.toDto(interestRepository.save(interestUpdated));
    }

    public void delete(Long id) {
        interestRepository.deleteById(id);
    }
}
