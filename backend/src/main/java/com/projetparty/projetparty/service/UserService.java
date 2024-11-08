package com.projetparty.projetparty.service;

import com.projetparty.projetparty.dto.UserDto;
import com.projetparty.projetparty.entity.User;
import com.projetparty.projetparty.mapper.UserMapper;
import com.projetparty.projetparty.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Cacheable(value = "usersList")
public class UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    
    public List<UserDto> findAll(Pageable pageable) {
        return userMapper.toDtos(userRepository.findAll());
    }

    public UserDto findById(long id) {
        return userMapper.toDto(userRepository.findById(id).orElse(null));
    }

    public UserDto findByEmail(String email) {
        return userMapper.toDto(userRepository.findByEmail(email).orElse(null));
    }

    public UserDto save(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userMapper.toDto(userRepository.save(user));
    }

    public UserDto update(Long id, UserDto userDto) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found with id " + id));
        userDto.setId(existingUser.getId());
        User userUpdated = userMapper.toEntity(userDto);
        return userMapper.toDto(userRepository.save(userUpdated));
    }

    public UserDto login(String email, String password) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            boolean matchPassword = passwordEncoder.matches(password, user.getPassword());
            if (matchPassword) {
                return userMapper.toDto(user);
            }
        }
        return null;
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
