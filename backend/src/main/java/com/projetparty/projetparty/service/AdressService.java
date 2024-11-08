package com.projetparty.projetparty.service;

import com.projetparty.projetparty.dto.AdressDto;
import com.projetparty.projetparty.entity.Adress;
import com.projetparty.projetparty.mapper.AdressMapper;
import com.projetparty.projetparty.repository.AdressRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@Service
@AllArgsConstructor
public class AdressService {
    private AdressRepository adressRepository;
    private AdressMapper adressMapper;
    
    public List<AdressDto> findAll(Pageable pageable) {
        return adressMapper.toDtos(adressRepository.findAll());
    }

    public AdressDto findById(long id) {
        return adressMapper.toDto(adressRepository.findById(id).orElse(null));
    }

    public AdressDto save(AdressDto adressDto) {
        Adress adress = adressMapper.toEntity(adressDto);
        return adressMapper.toDto(adressRepository.save(adress));
    }

    public AdressDto update(Long id, AdressDto adressDto) {
        Adress existingAdress = adressRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Adress not found with id " + id));
        adressDto.setId(existingAdress.getId());
        Adress adressUpdated = adressMapper.toEntity(adressDto);
        return adressMapper.toDto(adressRepository.save(adressUpdated));
    }

    public void delete(Long id) {
        adressRepository.deleteById(id);
    }
}
