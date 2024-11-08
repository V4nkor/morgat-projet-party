package com.projetparty.projetparty.mapper;


import com.projetparty.projetparty.dto.UserDto;
import com.projetparty.projetparty.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {MessageMapper.class, InterestMapper.class, RatingMapper.class, AdressMapper.class, EventMapper.class})
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
    List<UserDto> toDtos(List<User> users);
    List<User> toEntities(List<UserDto> userDtos);
}
