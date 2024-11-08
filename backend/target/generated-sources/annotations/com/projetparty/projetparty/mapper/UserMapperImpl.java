package com.projetparty.projetparty.mapper;

import com.projetparty.projetparty.dto.InterestDto;
import com.projetparty.projetparty.dto.MessageDto;
import com.projetparty.projetparty.dto.RatingDto;
import com.projetparty.projetparty.dto.UserDto;
import com.projetparty.projetparty.entity.Interest;
import com.projetparty.projetparty.entity.Message;
import com.projetparty.projetparty.entity.Rating;
import com.projetparty.projetparty.entity.User;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-08T11:22:07+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private InterestMapper interestMapper;
    @Autowired
    private RatingMapper ratingMapper;

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setUsername( user.getUsername() );
        userDto.setEmail( user.getEmail() );
        userDto.setPassword( user.getPassword() );
        userDto.setAge( user.getAge() );
        userDto.setInterests( interestSetToInterestDtoList( user.getInterests() ) );
        userDto.setRatings( ratingSetToRatingDtoList( user.getRatings() ) );
        userDto.setReceivedMessages( messageSetToMessageDtoList( user.getReceivedMessages() ) );
        userDto.setSentMessages( messageSetToMessageDtoList( user.getSentMessages() ) );

        return userDto;
    }

    @Override
    public User toEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setUsername( userDto.getUsername() );
        user.setEmail( userDto.getEmail() );
        user.setPassword( userDto.getPassword() );
        user.setAge( userDto.getAge() );
        user.setInterests( interestDtoListToInterestSet( userDto.getInterests() ) );
        user.setRatings( ratingDtoListToRatingSet( userDto.getRatings() ) );
        user.setReceivedMessages( messageDtoListToMessageSet( userDto.getReceivedMessages() ) );
        user.setSentMessages( messageDtoListToMessageSet( userDto.getSentMessages() ) );

        return user;
    }

    @Override
    public List<UserDto> toDtos(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( users.size() );
        for ( User user : users ) {
            list.add( toDto( user ) );
        }

        return list;
    }

    @Override
    public List<User> toEntities(List<UserDto> userDtos) {
        if ( userDtos == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userDtos.size() );
        for ( UserDto userDto : userDtos ) {
            list.add( toEntity( userDto ) );
        }

        return list;
    }

    protected List<InterestDto> interestSetToInterestDtoList(Set<Interest> set) {
        if ( set == null ) {
            return null;
        }

        List<InterestDto> list = new ArrayList<InterestDto>( set.size() );
        for ( Interest interest : set ) {
            list.add( interestMapper.toDto( interest ) );
        }

        return list;
    }

    protected List<RatingDto> ratingSetToRatingDtoList(Set<Rating> set) {
        if ( set == null ) {
            return null;
        }

        List<RatingDto> list = new ArrayList<RatingDto>( set.size() );
        for ( Rating rating : set ) {
            list.add( ratingMapper.toDto( rating ) );
        }

        return list;
    }

    protected List<MessageDto> messageSetToMessageDtoList(Set<Message> set) {
        if ( set == null ) {
            return null;
        }

        List<MessageDto> list = new ArrayList<MessageDto>( set.size() );
        for ( Message message : set ) {
            list.add( messageMapper.toDto( message ) );
        }

        return list;
    }

    protected Set<Interest> interestDtoListToInterestSet(List<InterestDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<Interest> set = new LinkedHashSet<Interest>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( InterestDto interestDto : list ) {
            set.add( interestMapper.toEntity( interestDto ) );
        }

        return set;
    }

    protected Set<Rating> ratingDtoListToRatingSet(List<RatingDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<Rating> set = new LinkedHashSet<Rating>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( RatingDto ratingDto : list ) {
            set.add( ratingMapper.toEntity( ratingDto ) );
        }

        return set;
    }

    protected Set<Message> messageDtoListToMessageSet(List<MessageDto> list) {
        if ( list == null ) {
            return null;
        }

        Set<Message> set = new LinkedHashSet<Message>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( MessageDto messageDto : list ) {
            set.add( messageMapper.toEntity( messageDto ) );
        }

        return set;
    }
}
